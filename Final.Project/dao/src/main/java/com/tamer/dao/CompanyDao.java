package com.tamer.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tamer.entities.Company;

public interface CompanyDao extends JpaRepository<Company, Long> {

}
