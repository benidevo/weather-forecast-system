package com.weatherforecast.gatewayservice.dto.http;

import com.weatherforecast.gatewayservice.dto.grpc.AuthDataDto;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginResponseDto {
  @Builder.Default private boolean success = true;
  private String message;
  private AuthDataDto data;
}
