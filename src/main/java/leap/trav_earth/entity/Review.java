package leap.trav_earth.entity;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    private String title;
    private String content;
    private String author;
    private LocalDate date;
    private String image;

}
