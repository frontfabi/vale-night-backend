package com.fabirodrigues.valenightbackend.controllers

import com.fabirodrigues.valenightbackend.models.EventEntity
import com.fabirodrigues.valenightbackend.repositories.EventRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/events")
class EventController(private val eventRepository: EventRepository) {

  @PostMapping
  fun create(@RequestBody eventEntity: EventEntity) = eventRepository.save(eventEntity)

  @GetMapping
  fun list() = eventRepository.findAll().toList()
}