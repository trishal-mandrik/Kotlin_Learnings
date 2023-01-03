package com.example.Simple.Web.Application

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.ResponseBody

@SpringBootApplication
class SimpleWebApplication

fun main(args: Array<String>) {
	runApplication<SimpleWebApplication>(*args)
	println("""Welcome 🙏🏻 
		|Happy Coding!
	""".trimMargin())
}

@Controller
class WebApp {
	@GetMapping ( "/home")
    @ResponseBody
	fun Greeting (): String {
		val message = """SPRINGER NATURE 🏢
			|Welcome to SNTPS..""".trimMargin()
		return message
	}
	 //http://localhost:8080/user/{Tejesh} -> Hello Tejesh ,Welcome to SN DIGITAL..
	@GetMapping ("/user/{firstname}")
	@ResponseBody
	fun greetUser (@PathVariable("firstname") firstname : String): String {
		return "Hello $firstname 👋🏻  Welcome to SN DIGITAL.."

	}
}