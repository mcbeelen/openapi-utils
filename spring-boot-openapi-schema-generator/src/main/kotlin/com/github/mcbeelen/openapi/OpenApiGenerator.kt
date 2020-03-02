package com.github.mcbeelen.openapi

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.Operation
import io.swagger.v3.oas.models.PathItem
import io.swagger.v3.oas.models.Paths

class OpenApiGenerator(basePackage: String) {
	fun generateInterfaceDescription(): OpenAPI {
		return OpenAPI().apply {
			paths = buildPaths()
		}

	}

	private fun buildPaths(): Paths {
		val paths = Paths()
		paths.addPathItem("/players", PathItem().apply {
			get = Operation().apply { operationId = "listAll" }
		})
		return paths

	}

}
