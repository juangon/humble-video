/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.humble.video;
import io.humble.ferry.*;
/**
 * Super class for Media Resampler objects.<br>
 * <br>
 * A resampler converts a type of media (e.g. Picture) to another<br>
 * type of the same media with some parameters change (e.g. color).
 */
public class MediaResampler extends Configurable {
  // JNIHelper.swg: Start generated code
  // >>>>>>>>>>>>>>>>>>>>>>>>>>>
  /**
   * This method is only here to use some references and remove
   * a Eclipse compiler warning.
   */
  @SuppressWarnings("unused")
  private void noop()
  {
    Buffer.make(null, 1);
  }
   
  private volatile long swigCPtr;

  /**
   * Internal Only.
   */
  protected MediaResampler(long cPtr, boolean cMemoryOwn) {
    super(VideoJNI.MediaResampler_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }
  
  /**
   * Internal Only.
   */
  protected MediaResampler(long cPtr, boolean cMemoryOwn,
      java.util.concurrent.atomic.AtomicLong ref)
  {
    super(VideoJNI.MediaResampler_SWIGUpcast(cPtr),
     cMemoryOwn, ref);
    swigCPtr = cPtr;
  }
    
  /**
   * Internal Only.  Not part of public API.
   *
   * Get the raw value of the native object that obj is proxying for.
   *   
   * @param obj The java proxy object for a native object.
   * @return The raw pointer obj is proxying for.
   */
  protected static long getCPtr(MediaResampler obj) {
    if (obj == null) return 0;
    return obj.getMyCPtr();
  }

  /**
   * Internal Only.  Not part of public API.
   *
   * Get the raw value of the native object that we're proxying for.
   *   
   * @return The raw pointer we're proxying for.
   */  
  protected long getMyCPtr() {
    if (swigCPtr == 0) throw new IllegalStateException("underlying native object already deleted");
    return swigCPtr;
  }
  
  /**
   * Create a new MediaResampler object that is actually referring to the
   * exact same underlying native object.
   *
   * @return the new Java object.
   */
  @Override
  public MediaResampler copyReference() {
    if (swigCPtr == 0)
      return null;
    else
      return new MediaResampler(swigCPtr, swigCMemOwn, getJavaRefCount());
  }

  /**
   * Compares two values, returning true if the underlying objects in native code are the same object.
   *
   * That means you can have two different Java objects, but when you do a comparison, you'll find out
   * they are the EXACT same object.
   *
   * @return True if the underlying native object is the same.  False otherwise.
   */
  public boolean equals(Object obj) {
    boolean equal = false;
    if (obj instanceof MediaResampler)
      equal = (((MediaResampler)obj).swigCPtr == this.swigCPtr);
    return equal;
  }
  
  /**
   * Get a hashable value for this object.
   *
   * @return the hashable value.
   */
  public int hashCode() {
     return (int)swigCPtr;
  }
  
  // <<<<<<<<<<<<<<<<<<<<<<<<<<<
  // JNIHelper.swg: End generated code
  
  public MediaResampler.State getState() {
    return MediaResampler.State.swigToEnum(VideoJNI.MediaResampler_getState(swigCPtr, this));
  }

/**
 * Resample in to out based on the resampler parameters.<br>
 * <br>
 * Resamples the in media based on the parameters set when<br>
 * this resampler was constructed.<br>
 * <br>
 * @param out The media we'll resample to.  Check<br>
 *     MediaSampled#isComplete() after the call.<br>
 * @param in The media we'll resample from.<br>
 * <br>
 * @throws InvalidArgument if in our out does not match the parameters this<br>
 *         resampler was set with.<br>
 * @throws InvalidArgument if the sub-class of in our out is of an invalid<br>
 *         type (e.g. passsing audio to a picture resampler).
 */
  public int resample(MediaSampled out, MediaSampled in) {
    return VideoJNI.MediaResampler_resample(swigCPtr, this, MediaSampled.getCPtr(out), out, MediaSampled.getCPtr(in), in);
  }

  public enum State {
    STATE_INITED,
    STATE_OPENED,
    STATE_ERROR,
  ;

    public final int swigValue() {
      return swigValue;
    }

    public static State swigToEnum(int swigValue) {
      State[] swigValues = State.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (State swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + State.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private State() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private State(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private State(State swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
