package leap.trav_earth.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetReviewListResponseDto {
    private String title;
    private String author;
    private LocalDate date;
}
