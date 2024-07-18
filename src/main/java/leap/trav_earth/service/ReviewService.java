package leap.trav_earth.service;

import leap.trav_earth.entity.Review;
import leap.trav_earth.repository.ReviewRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewService {

    private ReviewRepository reviewRepository;

    public Integer join(Review review){
        reviewRepository.save(review);
        return review.getId();
    }

    public List<Review> findReviews() {
        return reviewRepository.findAll();
    }

    public Optional<Review> getReviewById(Integer reviewId) {
        return reviewRepository.findById(reviewId);
    }
}
