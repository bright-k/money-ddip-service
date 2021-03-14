CREATE TABLE `ddip` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `room_id` VARCHAR(50) NOT NULL,
  `request_user_id` BIGINT(20) NOT NULL,
  `token` VARCHAR(20) NOT NULL,
  `member_count` INT NOT NULL,
  `amount` INT NOT NULL,
  `created_at` DATETIME(6) NOT NULL,
  CONSTRAINT `PK__ddip__id` PRIMARY KEY (`id`),
  UNIQUE KEY `UK__ddip__room_id_token` (`room_id`, `token`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

CREATE TABLE `ddip_slot` (
  `ddip_id` BIGINT(20) NOT NULL,
  `slot` INT NOT NULL,
  `amount` INT NOT NULL,
  `taken_user_id` BIGINT(20),
  `created_at` DATETIME(6) NOT NULL,
  CONSTRAINT `PK__ddip_slot__id` PRIMARY KEY (`ddip_id`, `slot`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
