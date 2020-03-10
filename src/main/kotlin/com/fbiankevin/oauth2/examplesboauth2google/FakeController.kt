package com.fbiankevin.oauth2.examplesboauth2google

import org.springframework.http.ResponseEntity
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.security.oauth2.core.oidc.user.OidcUser
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class FakeController {




    @GetMapping("/")
    fun greetings(@AuthenticationPrincipal principal: OidcUser) = ResponseEntity.ok("Hello, master ${principal.fullName}#(${principal.email})")


    @GetMapping("/restricted-area")
    fun restricted() = "This is area 48 This is secured aread."


    @GetMapping("/principals")
    fun principal(@AuthenticationPrincipal principal: OidcUser) = ResponseEntity.ok("Hello, master ${principal.fullName}#(${principal.email})")
}