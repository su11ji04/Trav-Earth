package leap.trav_earth.controller;

import leap.trav_earth.dto.GetReviewResponseDto;
import leap.trav_earth.entity.Review;
import leap.trav_earth.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class ReviewController {

    private final ReviewService reviewService;

    @Autowired
    public reviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping("/stay/review/add")
    public String beforeRegisterReview(){
        return "";
    }

    @PostMapping("/stay/review/add")
    public String afterRegisteReview(@ModelAttribute GetReviewResponseDto newReview) {
        Review review = new Review();
        review.setTitle(newReview.getTitle());
        review.setAuthor(newReview.getAuthor());
        review.setDate(LocalDate.now());
        review.setContent(newReview.getContent());
        review.setImage(newReview.getImage());
        reviewService.join(review);
        return "redirect:";
    }

    @GetMapping("/stay/review")
    public String getReviewList(Model model) {
        List<Review> letters = reviewService.findReviews();
        model.addAttribute("review", reviews);
        return "";
    }

    @GetMapping("/stay/review{reviewId}")
    public String getReview(@PathVariable Integer letterId, Model model) {
        Optional<Review> review = reviewService.getReviewById(letterId);
        if (review.isPresent()) {
            model.addAttribute("review", review.get());
            return "";
        } else {
            return "letter-not-found";
        }
    }
}
