package com.aditya.composebook.animation.core

fun translate(vertices: Array<Coordinate>, tx: Double = 1.0, ty: Double = 1.0, tz: Double = 1.0): List<Coordinate> {
    val matrix = getIdentityMatrix()
    matrix[3] = tx
    matrix[7] = ty
    matrix[11] = tz
    return transformation(vertices,matrix)
}

fun scale(
    vertices: Array<Coordinate>,
    sx: Double,
    sy: Double,
    sz: Double
): List<Coordinate> {
    val matrix: DoubleArray = getIdentityMatrix()
    matrix[0] = sx
    matrix[5] = sy
    matrix[10] = sz
    return transformation(vertices, matrix)
}

private fun getIdentityMatrix(): DoubleArray {
    val array =  DoubleArray(16)
    array[0] = 1.0
    array[5] = 1.0
    array[10] = 1.0
    array[15] = 1.0
    return array
}

private fun transformation(
    vertices: Array<Coordinate>,
    matrix: DoubleArray
): List<Coordinate> {
    val result = mutableListOf<Coordinate>()
    for (i in vertices.indices) {
        result.add(transformation(vertices[i], matrix))
        result[i].normalise()
    }
    return result
}

private fun transformation(
    vertex: Coordinate,
    matrix: DoubleArray
): Coordinate {
    val result = Coordinate()
    result.x = matrix[0] * vertex.x + matrix[1] * vertex.y + matrix[2] * vertex.z + matrix[3]
    result.y = matrix[4] * vertex.x + matrix[5] * vertex.y + matrix[6] * vertex.z + matrix[7]
    result.z = matrix[8] * vertex.x + matrix[9] * vertex.y + matrix[10] * vertex.z + matrix[11]
    result.w = matrix[12] * vertex.x + matrix[13] * vertex.y + matrix[14] * vertex.z + matrix[15]
    return result
}