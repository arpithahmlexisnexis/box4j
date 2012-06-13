/**
 * All rights reserved.
 */
package cn.com.believer.songyuanframework.openapi.storage.box.functions;

import java.util.List;

/**
 * @author Stefan Kopf
 * 
 */
public interface OverwriteResponse extends BoxResponse {

    /**
     * the UploadResult list.
     * @return the uploadResultList
     */
    public List getOverwriteResultList();

    /**
     * @param uploadResultList
     *            the uploadResultList to set
     */
    public void setOverwriteResultList(List uploadResultList);
}
