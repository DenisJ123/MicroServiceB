package ie.atu.microserviceb;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    public class UserDetails {
        private String name;
        private String email;
}
