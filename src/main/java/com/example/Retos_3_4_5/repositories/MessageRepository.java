package com.example.Retos_3_4_5.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Retos_3_4_5.entities.Message;

public interface MessageRepository extends JpaRepository<Message, Integer> {
}
