/**
 * 
 */
package cn.com.believer.songyuanframework.openapi.storage.box.functions;

import java.util.List;

/**
 * @author jjia
 * 
 */
public interface AddCommentResponse extends BoxResponse {

    /**
     * @return the comments
     */
    public List getComments();

    /**
     * @param comments
     *            the comments to set
     */
    public void setComments(List comments);
}
