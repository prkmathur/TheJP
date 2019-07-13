package com.app.thenhpattern.databinding;
import com.app.thenhpattern.R;
import com.app.thenhpattern.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentForgetPasswordBindingImpl extends FragmentForgetPasswordBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textView3, 2);
        sViewsWithIds.put(R.id.back_btn, 3);
        sViewsWithIds.put(R.id.forget_submit, 4);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener edtEmailandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of data.loginRequest.email
            //         is data.loginRequest.setEmail((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edtEmail);
            // localize variables for thread safety
            // data != null
            boolean dataJavaLangObjectNull = false;
            // data.loginRequest.email
            java.lang.String dataLoginRequestEmail = null;
            // data.loginRequest
            com.app.thenhpattern.model.vo.User.LoginRequest dataLoginRequest = null;
            // data
            com.app.thenhpattern.viewmodel.auth.LoginViewModel data = mData;
            // data.loginRequest != null
            boolean dataLoginRequestJavaLangObjectNull = false;



            dataJavaLangObjectNull = (data) != (null);
            if (dataJavaLangObjectNull) {


                dataLoginRequest = data.loginRequest;

                dataLoginRequestJavaLangObjectNull = (dataLoginRequest) != (null);
                if (dataLoginRequestJavaLangObjectNull) {




                    dataLoginRequest.setEmail(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentForgetPasswordBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private FragmentForgetPasswordBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[3]
            , (android.widget.EditText) bindings[1]
            , (android.widget.Button) bindings[4]
            , (android.widget.TextView) bindings[2]
            );
        this.edtEmail.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.data == variableId) {
            setData((com.app.thenhpattern.viewmodel.auth.LoginViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setData(@Nullable com.app.thenhpattern.viewmodel.auth.LoginViewModel Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.data);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeDataLoginRequest((com.app.thenhpattern.model.vo.User.LoginRequest) object, fieldId);
        }
        return false;
    }
    private boolean onChangeDataLoginRequest(com.app.thenhpattern.model.vo.User.LoginRequest DataLoginRequest, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.email) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String dataLoginRequestEmail = null;
        com.app.thenhpattern.model.vo.User.LoginRequest dataLoginRequest = null;
        com.app.thenhpattern.viewmodel.auth.LoginViewModel data = mData;

        if ((dirtyFlags & 0xfL) != 0) {



                if (data != null) {
                    // read data.loginRequest
                    dataLoginRequest = data.loginRequest;
                }
                updateRegistration(0, dataLoginRequest);


                if (dataLoginRequest != null) {
                    // read data.loginRequest.email
                    dataLoginRequestEmail = dataLoginRequest.getEmail();
                }
        }
        // batch finished
        if ((dirtyFlags & 0xfL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edtEmail, dataLoginRequestEmail);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edtEmail, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edtEmailandroidTextAttrChanged);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data.loginRequest
        flag 1 (0x2L): data
        flag 2 (0x3L): data.loginRequest.email
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}