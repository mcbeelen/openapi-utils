package net.example.application.player

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDate.of

@RestController
@RequestMapping("players")
class PlayerController {

	@GetMapping
	fun listAll() : List<Player> = listOf(Player("Marco Beelen", of(1977, 6, 27)))

}