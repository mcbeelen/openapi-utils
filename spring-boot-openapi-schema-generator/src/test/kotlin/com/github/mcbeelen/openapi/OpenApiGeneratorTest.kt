package com.github.mcbeelen.openapi

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.jupiter.api.Test

class OpenApiGeneratorTest {

	@Test
	internal fun `it should be able to generate an OpenAPI specification`() {

		val generator = OpenApiGenerator("net.example.application")

		val openAPI = generator.generateInterfaceDescription()

		val pathItem = openAPI.paths["/players"]
		assertThat(pathItem?.get?.operationId, equalTo("listAll"))
	}
}