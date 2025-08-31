package com.bishal.address.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bishal.address.entity.Address;

@Repository
public interface AddressRespository extends JpaRepository<Address, Long>{

}
