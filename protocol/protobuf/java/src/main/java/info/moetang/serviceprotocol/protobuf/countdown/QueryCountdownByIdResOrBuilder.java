// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: countdown/countdown.proto

package info.moetang.serviceprotocol.protobuf.countdown;

public interface QueryCountdownByIdResOrBuilder extends
    // @@protoc_insertion_point(interface_extends:countdown.QueryCountdownByIdRes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.shared.Result result = 1;</code>
   * @return Whether the result field is set.
   */
  boolean hasResult();
  /**
   * <code>.shared.Result result = 1;</code>
   * @return The result.
   */
  info.moetang.serviceprotocol.protobuf.shared.Result getResult();
  /**
   * <code>.shared.Result result = 1;</code>
   */
  info.moetang.serviceprotocol.protobuf.shared.ResultOrBuilder getResultOrBuilder();

  /**
   * <code>.countdown.Countdown countdown = 2;</code>
   * @return Whether the countdown field is set.
   */
  boolean hasCountdown();
  /**
   * <code>.countdown.Countdown countdown = 2;</code>
   * @return The countdown.
   */
  info.moetang.serviceprotocol.protobuf.countdown.Countdown getCountdown();
  /**
   * <code>.countdown.Countdown countdown = 2;</code>
   */
  info.moetang.serviceprotocol.protobuf.countdown.CountdownOrBuilder getCountdownOrBuilder();
}
