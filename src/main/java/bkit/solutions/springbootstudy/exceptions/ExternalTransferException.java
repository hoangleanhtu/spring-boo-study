package bkit.solutions.springbootstudy.exceptions;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class ExternalTransferException extends Exception {

  public static final String NOT_ENOUGH_BALANCE_ERROR_CODE = "ERR001";
  public static final String RECEIVING_ACCOUNT_NOT_FOUND_ERROR_CODE = "ERR004";
  public static final String RECEIVING_ACCOUNT_INACTIVE_ERROR_CODE = "ERR005";

  public static final ExternalTransferException NOT_ENOUGH_BALANCE = new ExternalTransferException(
      NOT_ENOUGH_BALANCE_ERROR_CODE);
  public static final ExternalTransferException RECEIVING_ACCOUNT_NOT_FOUND = new ExternalTransferException(
      RECEIVING_ACCOUNT_NOT_FOUND_ERROR_CODE);
  public static final ExternalTransferException RECEIVING_ACCOUNT_INACTIVE = new ExternalTransferException(
      RECEIVING_ACCOUNT_INACTIVE_ERROR_CODE);
  public static final ExternalTransferException TIMEOUT = new ExternalTransferException("ERR000");

  private final String errorCode;
}
