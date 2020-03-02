package com.github.mcbeelen.openapi

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import io.swagger.v3.oas.models.info.Info
import org.junit.jupiter.api.Test

class OpenApiTest {

	@Test
	internal fun `it should be able to generate an OpenAPI specification`() {

		val openAPI = io.swagger.v3.oas.models.OpenAPI().apply {
			info = Info().apply {
				title = "Test API"
			}
		}

		assertThat(openAPI.info.title, equalTo("Test API"))
	}
}