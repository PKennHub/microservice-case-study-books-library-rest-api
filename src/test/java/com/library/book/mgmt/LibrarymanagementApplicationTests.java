package com.library.book.mgmt;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.library.book.mgmt.model.Books;
import com.library.book.mgmt.model.Subscription;
import com.library.book.mgmt.repository.BooksRepository;
import com.library.book.mgmt.repository.SubscriptionRepository;

@SpringBootTest
class LibrarymanagementApplicationTests {

	@Autowired
	private BooksRepository booksrepository;

	@Autowired
	private SubscriptionRepository subscriptionrepository;


	@Test
	@Order(1)
	public void getAllBooks() {
		List<Books> bookList =  booksrepository.findAll();
		Assertions.assertThat(bookList.size()>0);

	}

	@Test
	@Order(2)
	public void getAllSubscriptions(){	
		List<Subscription> subList = subscriptionrepository.findAll();
		Assertions.assertThat(subList.size()>0);

	}

	@Test
	@Order(3)
	public void addSubscription() {
		Subscription subs = new Subscription("Keerthana","B1212","","2021-12-16");
		subscriptionrepository.save(subs);
		Assertions.assertThat(subs.getBook_id().equalsIgnoreCase("B1212"));

	}

	@Test
	@Order(4)
	public void getAllSubscription(){	
		Subscription subs = subscriptionrepository.findById("Keerthana").get();
		Assertions.assertThat(subs.getBook_id()).isEqualTo("B1212");

	}




}
