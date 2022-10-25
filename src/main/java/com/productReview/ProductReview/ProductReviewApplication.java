package com.productReview.ProductReview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.IOException;

import com.gpcoder.service.AuthenticationClient;

import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
@SpringBootApplication
public class ProductReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductReviewApplication.class, args);
	}

}
