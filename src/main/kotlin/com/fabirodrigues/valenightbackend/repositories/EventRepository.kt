package com.fabirodrigues.valenightbackend.repositories

import com.fabirodrigues.valenightbackend.models.EventEntity
import org.springframework.data.repository.CrudRepository
import java.util.UUID

interface EventRepository : CrudRepository<EventEntity, UUID>
