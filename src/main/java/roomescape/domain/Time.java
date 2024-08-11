package roomescape.domain;

import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
@Table(name = "time")
public class Time {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "time")
    private LocalTime time;
}
