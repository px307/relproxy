
package com.innowhere.relproxy.impl.jproxy.clsmgr.comp;

import com.innowhere.relproxy.RelProxyException;
import com.innowhere.relproxy.impl.jproxy.clsmgr.ClassDescriptorSourceUnit;

/**
 *
 * @author jmarranz
 */
public class JProxyCompilationException extends RelProxyException
{
    protected ClassDescriptorSourceUnit sourceUnit;
    
    public JProxyCompilationException(ClassDescriptorSourceUnit sourceUnit) 
    {
        super("Compilation error");
        this.sourceUnit = sourceUnit;
    }        
    
    public ClassDescriptorSourceUnit getClassDescriptorSourceUnit()
    {
        return sourceUnit;
    }
}
