package com.opos.datasync.repository;

import com.opos.datasync.model.Message;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, String> {
}
