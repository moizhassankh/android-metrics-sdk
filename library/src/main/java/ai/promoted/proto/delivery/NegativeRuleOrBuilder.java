// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/delivery/blender.proto

package ai.promoted.proto.delivery;

public interface NegativeRuleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:delivery.NegativeRule)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>double pluck_pct = 1;</code>
   * @return Whether the pluckPct field is set.
   */
  boolean hasPluckPct();
  /**
   * <code>double pluck_pct = 1;</code>
   * @return The pluckPct.
   */
  double getPluckPct();

  /**
   * <code>uint64 forbid_less_pos = 2;</code>
   * @return Whether the forbidLessPos field is set.
   */
  boolean hasForbidLessPos();
  /**
   * <code>uint64 forbid_less_pos = 2;</code>
   * @return The forbidLessPos.
   */
  long getForbidLessPos();

  /**
   * <code>uint64 min_spacing = 3;</code>
   * @return Whether the minSpacing field is set.
   */
  boolean hasMinSpacing();
  /**
   * <code>uint64 min_spacing = 3;</code>
   * @return The minSpacing.
   */
  long getMinSpacing();

  /**
   * <code>uint64 forbid_greater_pos = 4;</code>
   * @return Whether the forbidGreaterPos field is set.
   */
  boolean hasForbidGreaterPos();
  /**
   * <code>uint64 forbid_greater_pos = 4;</code>
   * @return The forbidGreaterPos.
   */
  long getForbidGreaterPos();

  /**
   * <code>uint64 max_count = 5;</code>
   * @return Whether the maxCount field is set.
   */
  boolean hasMaxCount();
  /**
   * <code>uint64 max_count = 5;</code>
   * @return The maxCount.
   */
  long getMaxCount();
}
