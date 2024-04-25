package co.istad.mbanking.base;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BaseErrorResponse {
    private BaseError baseError;
}
