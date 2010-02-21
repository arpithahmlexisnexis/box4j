/**
 * 
 */
package cn.com.believer.songyuanframework.openapi.storage.box.impl.simple.functions;

import java.util.List;

import cn.com.believer.songyuanframework.openapi.storage.box.functions.AddCommentResponse;

/**
 * @author jjia
 * 
 */
public class AddCommentResponseImpl extends BoxResponseImpl implements
        AddCommentResponse {

    /**
     * comments.
     */
    private List comments;

    /**
     * @return the comments
     */
    public List getComments() {
        return this.comments;
    }

    /**
     * @param comments
     *            the comments to set
     */
    public void setComments(List comments) {
        this.comments = comments;
    }
}
