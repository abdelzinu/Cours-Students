package com.manager.ecole.exception;

import com.manager.ecole.utils.ErrorTypes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorMessageResponse<Message> {
  private ErrorTypes errorType;
  private Message message;
}
