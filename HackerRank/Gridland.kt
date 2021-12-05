fun main(args: Array<String>) {
    val journeysCount = readLine()!!.trim().toInt()

    val journeys = Array<String>(journeysCount, { "" })
    for (i in 0 until journeysCount) {
        val journeysItem = readLine()!!
        journeys[i] = journeysItem
    }

    val result = getSafePaths(journeys)

    println(result.joinToString("\n"))
}

fun getSafePaths(journeys: Array<String>): Array<String> {
    val safePaths : Array<String> = Array(journeys.size) {""}
    for (index in journeys.indices) {
        val journeyIndices = journeys[index].split(' ')
        val xIndex = Integer.parseInt(journeyIndices[0])
        val yIndex = Integer.parseInt(journeyIndices[1])
        val kIndex = Integer.parseInt(journeyIndices[2])
        val path = getSafePath(xIndex, yIndex, kIndex)
        safePaths[index] = path
    }
    return safePaths
}


fun getSafePath(x_index: Int, y_index: Int, k_index: Int): String {
    var k = k_index
    val row = y_index + 1
    val column = x_index + 1 // x_index, y_index is column and row index,
    val totalPaths = Array(row) { IntArray(column) } // totalPaths[i][j] keep sum of paths to (x_index,y_index) from (j,i)
    totalPaths[row - 1][column - 1] = 1
    for (i in row - 1 downTo 0) {
        for (j in column - 1 downTo 0) {
            if (i == row - 1 && j == column - 1) continue
            val right = if (i + 1 == row) 0 else totalPaths[i + 1][j]
            val down = if (j + 1 == column) 0 else totalPaths[i][j + 1]
            totalPaths[i][j] = right + down
        }
    }
    val desiredPath = StringBuilder()
    var i = 0
    var j = 0
    k++
    while (true) {
        val right = if (j + 1 == column) 0 else totalPaths[i][j + 1]
        if (k <= right) {
            desiredPath.append("H")
            j++
        } else {
            desiredPath.append("V")
            i++
            k -= right
        }
        if (i == y_index && j == x_index) break
    }
    return desiredPath.toString()
}
