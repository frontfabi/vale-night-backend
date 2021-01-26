package com.fabirodrigues.valenightbackend.models

import java.time.LocalDateTime
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "events")
data class EventEntity(
  val title: String,
  val description: String,
  val startDate: LocalDateTime,
  val endDate: LocalDateTime,
  val location: String,
  val url: String,
  @Enumerated(EnumType.STRING)
  val modality: EventModalityEnum,
  @Enumerated(EnumType.STRING)
  val status:  EventStatusEnum
) {
  @Id
  val id: UUID = UUID.randomUUID()
}

enum class EventStatusEnum {
  CANCELED, IN_PROGRESS, OUTDATED
}

enum class EventModalityEnum {
  ON_LINE, PRESENTIAL
}