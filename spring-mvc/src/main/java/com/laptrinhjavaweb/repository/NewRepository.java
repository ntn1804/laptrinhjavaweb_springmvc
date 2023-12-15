package com.laptrinhjavaweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptrinhjavaweb.entity.NewEntity;

// <sử dụng table nào, kiểu dữ liệu của primary key>
// NewRepository tương tự NewDAO (k cần khai báo @Repository vì đã extends JpaRepository)
public interface NewRepository extends JpaRepository<NewEntity, Long> {

}
