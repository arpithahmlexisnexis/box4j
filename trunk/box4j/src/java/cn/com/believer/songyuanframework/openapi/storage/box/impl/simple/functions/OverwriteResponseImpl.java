/**
 * All rights reserved.
 */
package cn.com.believer.songyuanframework.openapi.storage.box.impl.simple.functions;

import java.util.List;

import cn.com.believer.songyuanframework.openapi.storage.box.functions.OverwriteResponse;

/**
 * @author Stefan Kopf
 * 
 */
public class OverwriteResponseImpl extends BoxResponseImpl implements
        OverwriteResponse {

    /** a list of UploadResult object. */
    private List overwriteResultList;

    /**
     * @return the uploadResultList
     */
    public List getOverwriteResultList() {
        return this.overwriteResultList;
    }

    /**
     * @param overwriteResultList
     *            the uploadResultList to set
     */
    public void setOverwriteResultList(List overwriteResultList) {
        this.overwriteResultList = overwriteResultList;
    }
}
