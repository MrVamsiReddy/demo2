package com.testapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testapi.Entity.api;

public interface Repository extends JpaRepository<api, Long> {

}
