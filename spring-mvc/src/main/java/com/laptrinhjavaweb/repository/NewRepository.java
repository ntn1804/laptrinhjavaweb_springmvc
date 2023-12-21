package com.laptrinhjavaweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptrinhjavaweb.entity.NewEntity;

// <su dung table nao, kieu du lieu cua primary key>
// NewRepository tuong tu NewDAO (k can khai bao @Repository vi da extends JpaRepository)
public interface NewRepository extends JpaRepository<NewEntity, Long> {

}
