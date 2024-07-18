package leap.trav_earth.dto;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetReviewResponseDto {
    private Integer id;
    private String title;
    private String content;
    private String author;
    private LocalDate date;
    private String image;
}
