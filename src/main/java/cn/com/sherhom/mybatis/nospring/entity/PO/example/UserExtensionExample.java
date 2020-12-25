package cn.com.sherhom.mybatis.nospring.entity.PO.example;

/**
 * @author Sherhom
 * @date 2020/12/25 16:26
 */
public class UserExtensionExample extends UserPOExample {
    public ExtensionCriteria createExtensionCriteria(){
        ExtensionCriteria criteria=createExtensionCriteriaInternal();
        if(oredCriteria.size()==0){
            oredCriteria.add(criteria);
        }
        return criteria;
    }
    public ExtensionCriteria getFirstCriteria(){
        if(oredCriteria.size()==0){
            createExtensionCriteria();
        }
        if(oredCriteria.get(0) instanceof ExtensionCriteria){
            return (ExtensionCriteria)oredCriteria.get(0);
        }
        else{
            oredCriteria.set(0,new ExtensionCriteria(oredCriteria.get(0)));
            return (ExtensionCriteria)oredCriteria.get(0);
        }
    }
    protected ExtensionCriteria createExtensionCriteriaInternal(){
        ExtensionCriteria criteria=new ExtensionCriteria();
        return criteria;
    }
    public static class ExtensionCriteria extends Criteria{
        protected ExtensionCriteria(){
            super();
        }
        protected ExtensionCriteria(Criteria criteria){
            super();
            this.criteria=criteria.getCriteria();
        }
    }
}
