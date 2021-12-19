package com.library.book.mgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.book.mgmt.model.Subscription;

@Repository
public interface SubscriptionRepository extends JpaRepository<Subscription, String>{

}
