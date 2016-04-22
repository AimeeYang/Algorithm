/**
  * Created by ayang on 2016/4/22.
  * refer: http://blog.csdn.net/v_july_v/article/details/7041827
  */

/**
 * 模式匹配
 */
class KMP{
  /// O(mn)
  /// find patern in original
  def kmp1(original: String, pattern:String){
    val original_len=original.length;
    val patern_len=pattern.length;
    var i=0;
    var j=0;
    if(original_len>=patern_len){
      while(i+patern_len<original_len && j<patern_len){
        if(original.charAt(i)==pattern.charAt(j)){
          i=i+1;
          j=j+1;
        }else{
          i=i-j+1; //回退
          j=0;
        }
      }
      if(j==patern_len) i-1 else -1;
    }
  }

  def kmp2(original:String, pattern:String){

  }
}

object KMP {

}
