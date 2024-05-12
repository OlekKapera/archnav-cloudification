package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jspx extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_af_commandButton_visible_text_id_action_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_facet_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_af_spacer_id_height_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_af_form_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_af_outputText_value_id_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_af_document_title_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_af_commandButton_visible_text_partialSubmit_id_action_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_af_panelGroupLayout_valign_styleClass_layout_id_halign;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_af_inputText_required_maximumLength_label_id_binding_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_af_inputText_secret_required_maximumLength_label_id_binding_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_af_dialog_type_title_partialTriggers_id_closeIconVisible;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_view;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_af_popup_partialTriggers_id_clientComponent_childCreation_binding_animate;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_af_commandButton_text_id_action_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_af_panelGroupLayout_layout_id_halign;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_af_image_source_shortDesc_id_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_af_panelBox_titleHalign_text_showDisclosure_ramp_id;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_af_commandButton_visible_text_id_action_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_f_facet_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_af_spacer_id_height_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_af_form_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_af_outputText_value_id_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_af_document_title_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_af_commandButton_visible_text_partialSubmit_id_action_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_af_panelGroupLayout_valign_styleClass_layout_id_halign = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_af_inputText_required_maximumLength_label_id_binding_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_af_inputText_secret_required_maximumLength_label_id_binding_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_af_dialog_type_title_partialTriggers_id_closeIconVisible = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_f_view = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_af_popup_partialTriggers_id_clientComponent_childCreation_binding_animate = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_af_commandButton_text_id_action_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_af_panelGroupLayout_layout_id_halign = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_af_image_source_shortDesc_id_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_af_panelBox_titleHalign_text_showDisclosure_ramp_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_af_commandButton_visible_text_id_action_nobody.release();
    _jspx_tagPool_f_facet_name_nobody.release();
    _jspx_tagPool_af_spacer_id_height_nobody.release();
    _jspx_tagPool_af_form_id.release();
    _jspx_tagPool_af_outputText_value_id_nobody.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_af_document_title_id.release();
    _jspx_tagPool_af_commandButton_visible_text_partialSubmit_id_action_nobody.release();
    _jspx_tagPool_af_panelGroupLayout_valign_styleClass_layout_id_halign.release();
    _jspx_tagPool_af_inputText_required_maximumLength_label_id_binding_nobody.release();
    _jspx_tagPool_af_inputText_secret_required_maximumLength_label_id_binding_nobody.release();
    _jspx_tagPool_af_dialog_type_title_partialTriggers_id_closeIconVisible.release();
    _jspx_tagPool_f_view.release();
    _jspx_tagPool_af_popup_partialTriggers_id_clientComponent_childCreation_binding_animate.release();
    _jspx_tagPool_af_commandButton_text_id_action_nobody.release();
    _jspx_tagPool_af_panelGroupLayout_layout_id_halign.release();
    _jspx_tagPool_af_image_source_shortDesc_id_nobody.release();
    _jspx_tagPool_af_panelBox_titleHalign_text_showDisclosure_ramp_id.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      response.setHeader("X-Powered-By", "JSP/2.3");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      if (_jspx_meth_f_view_0(_jspx_page_context))
        return;
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{adfBundle['com.archemy.searchapp.view.ArchemyAppViewBundle']}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_c_set_0.setVar("archemyappviewBundle");
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_f_view_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:view
    com.sun.faces.taglib.jsf_core.ViewTag _jspx_th_f_view_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.jsf_core.ViewTag.class) : new com.sun.faces.taglib.jsf_core.ViewTag();
    _jspx_th_f_view_0.setPageContext(_jspx_page_context);
    _jspx_th_f_view_0.setParent(null);
    _jspx_th_f_view_0.setJspId("id3");
    int _jspx_eval_f_view_0 = _jspx_th_f_view_0.doStartTag();
    if (_jspx_eval_f_view_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_f_view_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_f_view_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_f_view_0.doInitBody();
      }
      do {
        if (_jspx_meth_af_document_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_view_0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_f_view_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_f_view_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_f_view_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_f_view.reuse(_jspx_th_f_view_0);
      return true;
    }
    _jspx_tagPool_f_view.reuse(_jspx_th_f_view_0);
    return false;
  }

  private boolean _jspx_meth_af_document_0(javax.servlet.jsp.tagext.JspTag _jspx_th_f_view_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:document
    oracle.adfinternal.view.faces.unified.taglib.UnifiedDocumentTag _jspx_th_af_document_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.unified.taglib.UnifiedDocumentTag.class) : new oracle.adfinternal.view.faces.unified.taglib.UnifiedDocumentTag();
    _jspx_th_af_document_0.setPageContext(_jspx_page_context);
    _jspx_th_af_document_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_view_0);
    _jspx_th_af_document_0.setJspId("id4");
    _jspx_th_af_document_0.setId("d1");
    _jspx_th_af_document_0.setTitle(org.apache.jasper.runtime.PageContextImpl.getValueExpression("login.jspx", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_af_document_0 = _jspx_th_af_document_0.doStartTag();
    if (_jspx_eval_af_document_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_af_document_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_af_document_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_af_document_0.doInitBody();
      }
      do {
        if (_jspx_meth_af_form_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_document_0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_af_document_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_af_document_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_af_document_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_document_title_id.reuse(_jspx_th_af_document_0);
      return true;
    }
    _jspx_tagPool_af_document_title_id.reuse(_jspx_th_af_document_0);
    return false;
  }

  private boolean _jspx_meth_af_form_0(javax.servlet.jsp.tagext.JspTag _jspx_th_af_document_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:form
    oracle.adfinternal.view.faces.unified.taglib.UnifiedFormTag _jspx_th_af_form_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.unified.taglib.UnifiedFormTag.class) : new oracle.adfinternal.view.faces.unified.taglib.UnifiedFormTag();
    _jspx_th_af_form_0.setPageContext(_jspx_page_context);
    _jspx_th_af_form_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_document_0);
    _jspx_th_af_form_0.setJspId("id5");
    _jspx_th_af_form_0.setId("f1");
    int _jspx_eval_af_form_0 = _jspx_th_af_form_0.doStartTag();
    if (_jspx_eval_af_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_af_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_af_form_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_af_form_0.doInitBody();
      }
      do {
        if (_jspx_meth_af_panelGroupLayout_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_form_0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_af_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_af_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_af_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_form_id.reuse(_jspx_th_af_form_0);
      return true;
    }
    _jspx_tagPool_af_form_id.reuse(_jspx_th_af_form_0);
    return false;
  }

  private boolean _jspx_meth_af_panelGroupLayout_0(javax.servlet.jsp.tagext.JspTag _jspx_th_af_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:panelGroupLayout
    oracle.adfinternal.view.faces.unified.taglib.layout.UnifiedPanelGroupLayoutTag _jspx_th_af_panelGroupLayout_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.unified.taglib.layout.UnifiedPanelGroupLayoutTag.class) : new oracle.adfinternal.view.faces.unified.taglib.layout.UnifiedPanelGroupLayoutTag();
    _jspx_th_af_panelGroupLayout_0.setPageContext(_jspx_page_context);
    _jspx_th_af_panelGroupLayout_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_form_0);
    _jspx_th_af_panelGroupLayout_0.setJspId("id6");
    _jspx_th_af_panelGroupLayout_0.setHalign(org.apache.jasper.runtime.PageContextImpl.getValueExpression("center", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_af_panelGroupLayout_0.setLayout(org.apache.jasper.runtime.PageContextImpl.getValueExpression("horizontal", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_af_panelGroupLayout_0.setId("pg1");
    int _jspx_eval_af_panelGroupLayout_0 = _jspx_th_af_panelGroupLayout_0.doStartTag();
    if (_jspx_eval_af_panelGroupLayout_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_af_panelGroupLayout_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_af_panelGroupLayout_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_af_panelGroupLayout_0.doInitBody();
      }
      do {
        if (_jspx_meth_af_spacer_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_panelGroupLayout_0, _jspx_page_context))
          return true;
        if (_jspx_meth_af_popup_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_panelGroupLayout_0, _jspx_page_context))
          return true;
        if (_jspx_meth_af_panelGroupLayout_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_panelGroupLayout_0, _jspx_page_context))
          return true;
        if (_jspx_meth_af_spacer_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_panelGroupLayout_0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_af_panelGroupLayout_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_af_panelGroupLayout_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_af_panelGroupLayout_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_panelGroupLayout_layout_id_halign.reuse(_jspx_th_af_panelGroupLayout_0);
      return true;
    }
    _jspx_tagPool_af_panelGroupLayout_layout_id_halign.reuse(_jspx_th_af_panelGroupLayout_0);
    return false;
  }

  private boolean _jspx_meth_af_spacer_0(javax.servlet.jsp.tagext.JspTag _jspx_th_af_panelGroupLayout_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:spacer
    oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSpacerTag _jspx_th_af_spacer_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSpacerTag.class) : new oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSpacerTag();
    _jspx_th_af_spacer_0.setPageContext(_jspx_page_context);
    _jspx_th_af_spacer_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_panelGroupLayout_0);
    _jspx_th_af_spacer_0.setJspId("id7");
    _jspx_th_af_spacer_0.setId("sp23");
    _jspx_th_af_spacer_0.setHeight(org.apache.jasper.runtime.PageContextImpl.getValueExpression("500", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_af_spacer_0 = _jspx_th_af_spacer_0.doStartTag();
    if (_jspx_th_af_spacer_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_spacer_id_height_nobody.reuse(_jspx_th_af_spacer_0);
      return true;
    }
    _jspx_tagPool_af_spacer_id_height_nobody.reuse(_jspx_th_af_spacer_0);
    return false;
  }

  private boolean _jspx_meth_af_popup_0(javax.servlet.jsp.tagext.JspTag _jspx_th_af_panelGroupLayout_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:popup
    oracle.adfinternal.view.faces.unified.taglib.UnifiedPopupTag _jspx_th_af_popup_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.unified.taglib.UnifiedPopupTag.class) : new oracle.adfinternal.view.faces.unified.taglib.UnifiedPopupTag();
    _jspx_th_af_popup_0.setPageContext(_jspx_page_context);
    _jspx_th_af_popup_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_panelGroupLayout_0);
    _jspx_th_af_popup_0.setJspId("id8");
    _jspx_th_af_popup_0.setClientComponent(org.apache.jasper.runtime.PageContextImpl.getValueExpression("true", (PageContext)_jspx_page_context, boolean.class, null));
    _jspx_th_af_popup_0.setPartialTriggers(org.apache.jasper.runtime.PageContextImpl.getValueExpression("cb1", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_af_popup_0.setChildCreation("immediate");
    _jspx_th_af_popup_0.setAnimate(org.apache.jasper.runtime.PageContextImpl.getValueExpression("default", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_af_popup_0.setBinding(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{LoginBean.popUp}", (PageContext)_jspx_page_context, javax.faces.component.UIComponent.class, null));
    _jspx_th_af_popup_0.setId("pp3");
    int _jspx_eval_af_popup_0 = _jspx_th_af_popup_0.doStartTag();
    if (_jspx_eval_af_popup_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_af_popup_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_af_popup_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_af_popup_0.doInitBody();
      }
      do {
        if (_jspx_meth_af_dialog_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_popup_0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_af_popup_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_af_popup_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_af_popup_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_popup_partialTriggers_id_clientComponent_childCreation_binding_animate.reuse(_jspx_th_af_popup_0);
      return true;
    }
    _jspx_tagPool_af_popup_partialTriggers_id_clientComponent_childCreation_binding_animate.reuse(_jspx_th_af_popup_0);
    return false;
  }

  private boolean _jspx_meth_af_dialog_0(javax.servlet.jsp.tagext.JspTag _jspx_th_af_popup_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:dialog
    oracle.adfinternal.view.faces.unified.taglib.UnifiedDialogTag _jspx_th_af_dialog_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.unified.taglib.UnifiedDialogTag.class) : new oracle.adfinternal.view.faces.unified.taglib.UnifiedDialogTag();
    _jspx_th_af_dialog_0.setPageContext(_jspx_page_context);
    _jspx_th_af_dialog_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_popup_0);
    _jspx_th_af_dialog_0.setJspId("id9");
    _jspx_th_af_dialog_0.setTitle(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{archemyappviewBundle.LOGIN_FAILED}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_af_dialog_0.setPartialTriggers(org.apache.jasper.runtime.PageContextImpl.getValueExpression("cb1", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_af_dialog_0.setType(org.apache.jasper.runtime.PageContextImpl.getValueExpression("none", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_af_dialog_0.setCloseIconVisible(org.apache.jasper.runtime.PageContextImpl.getValueExpression("false", (PageContext)_jspx_page_context, boolean.class, null));
    _jspx_th_af_dialog_0.setId("dg1");
    int _jspx_eval_af_dialog_0 = _jspx_th_af_dialog_0.doStartTag();
    if (_jspx_eval_af_dialog_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_af_dialog_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_af_dialog_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_af_dialog_0.doInitBody();
      }
      do {
        if (_jspx_meth_af_outputText_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_dialog_0, _jspx_page_context))
          return true;
        if (_jspx_meth_af_spacer_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_dialog_0, _jspx_page_context))
          return true;
        if (_jspx_meth_af_commandButton_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_dialog_0, _jspx_page_context))
          return true;
        if (_jspx_meth_af_commandButton_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_dialog_0, _jspx_page_context))
          return true;
        if (_jspx_meth_af_commandButton_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_dialog_0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_af_dialog_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_af_dialog_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_af_dialog_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_dialog_type_title_partialTriggers_id_closeIconVisible.reuse(_jspx_th_af_dialog_0);
      return true;
    }
    _jspx_tagPool_af_dialog_type_title_partialTriggers_id_closeIconVisible.reuse(_jspx_th_af_dialog_0);
    return false;
  }

  private boolean _jspx_meth_af_outputText_0(javax.servlet.jsp.tagext.JspTag _jspx_th_af_dialog_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:outputText
    oracle.adfinternal.view.faces.unified.taglib.output.UnifiedOutputTextTag _jspx_th_af_outputText_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.unified.taglib.output.UnifiedOutputTextTag.class) : new oracle.adfinternal.view.faces.unified.taglib.output.UnifiedOutputTextTag();
    _jspx_th_af_outputText_0.setPageContext(_jspx_page_context);
    _jspx_th_af_outputText_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_dialog_0);
    _jspx_th_af_outputText_0.setJspId("id10");
    _jspx_th_af_outputText_0.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{pageFlowScope.errorMessage}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_af_outputText_0.setId("opt1");
    int _jspx_eval_af_outputText_0 = _jspx_th_af_outputText_0.doStartTag();
    if (_jspx_th_af_outputText_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_outputText_value_id_nobody.reuse(_jspx_th_af_outputText_0);
      return true;
    }
    _jspx_tagPool_af_outputText_value_id_nobody.reuse(_jspx_th_af_outputText_0);
    return false;
  }

  private boolean _jspx_meth_af_spacer_1(javax.servlet.jsp.tagext.JspTag _jspx_th_af_dialog_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:spacer
    oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSpacerTag _jspx_th_af_spacer_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSpacerTag.class) : new oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSpacerTag();
    _jspx_th_af_spacer_1.setPageContext(_jspx_page_context);
    _jspx_th_af_spacer_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_dialog_0);
    _jspx_th_af_spacer_1.setJspId("id11");
    _jspx_th_af_spacer_1.setHeight(org.apache.jasper.runtime.PageContextImpl.getValueExpression("5", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_af_spacer_1.setId("sp2");
    int _jspx_eval_af_spacer_1 = _jspx_th_af_spacer_1.doStartTag();
    if (_jspx_th_af_spacer_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_spacer_id_height_nobody.reuse(_jspx_th_af_spacer_1);
      return true;
    }
    _jspx_tagPool_af_spacer_id_height_nobody.reuse(_jspx_th_af_spacer_1);
    return false;
  }

  private boolean _jspx_meth_af_commandButton_0(javax.servlet.jsp.tagext.JspTag _jspx_th_af_dialog_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:commandButton
    oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandButtonTag _jspx_th_af_commandButton_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandButtonTag.class) : new oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandButtonTag();
    _jspx_th_af_commandButton_0.setPageContext(_jspx_page_context);
    _jspx_th_af_commandButton_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_dialog_0);
    _jspx_th_af_commandButton_0.setJspId("id12");
    _jspx_th_af_commandButton_0.setAction(org.apache.jasper.runtime.PageContextImpl.getMethodExpression("none", (PageContext)_jspx_page_context, null, java.lang.String.class, new Class[] {}));
    _jspx_th_af_commandButton_0.setVisible(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{not pageFlowScope.expireWarning}", (PageContext)_jspx_page_context, boolean.class, null));
    _jspx_th_af_commandButton_0.setText(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{archemyappviewBundle.OK}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_af_commandButton_0.setId("cb5");
    int _jspx_eval_af_commandButton_0 = _jspx_th_af_commandButton_0.doStartTag();
    if (_jspx_th_af_commandButton_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_commandButton_visible_text_id_action_nobody.reuse(_jspx_th_af_commandButton_0);
      return true;
    }
    _jspx_tagPool_af_commandButton_visible_text_id_action_nobody.reuse(_jspx_th_af_commandButton_0);
    return false;
  }

  private boolean _jspx_meth_af_commandButton_1(javax.servlet.jsp.tagext.JspTag _jspx_th_af_dialog_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:commandButton
    oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandButtonTag _jspx_th_af_commandButton_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandButtonTag.class) : new oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandButtonTag();
    _jspx_th_af_commandButton_1.setPageContext(_jspx_page_context);
    _jspx_th_af_commandButton_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_dialog_0);
    _jspx_th_af_commandButton_1.setJspId("id13");
    _jspx_th_af_commandButton_1.setAction(org.apache.jasper.runtime.PageContextImpl.getMethodExpression("changePassword", (PageContext)_jspx_page_context, null, java.lang.String.class, new Class[] {}));
    _jspx_th_af_commandButton_1.setText(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{archemyappviewBundle.CHANGE_PASSWORD}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_af_commandButton_1.setVisible(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{pageFlowScope.expireWarning}", (PageContext)_jspx_page_context, boolean.class, null));
    _jspx_th_af_commandButton_1.setPartialSubmit(org.apache.jasper.runtime.PageContextImpl.getValueExpression("true", (PageContext)_jspx_page_context, boolean.class, null));
    _jspx_th_af_commandButton_1.setId("cb6");
    int _jspx_eval_af_commandButton_1 = _jspx_th_af_commandButton_1.doStartTag();
    if (_jspx_th_af_commandButton_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_commandButton_visible_text_partialSubmit_id_action_nobody.reuse(_jspx_th_af_commandButton_1);
      return true;
    }
    _jspx_tagPool_af_commandButton_visible_text_partialSubmit_id_action_nobody.reuse(_jspx_th_af_commandButton_1);
    return false;
  }

  private boolean _jspx_meth_af_commandButton_2(javax.servlet.jsp.tagext.JspTag _jspx_th_af_dialog_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:commandButton
    oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandButtonTag _jspx_th_af_commandButton_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandButtonTag.class) : new oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandButtonTag();
    _jspx_th_af_commandButton_2.setPageContext(_jspx_page_context);
    _jspx_th_af_commandButton_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_dialog_0);
    _jspx_th_af_commandButton_2.setJspId("id14");
    _jspx_th_af_commandButton_2.setAction(org.apache.jasper.runtime.PageContextImpl.getMethodExpression("success", (PageContext)_jspx_page_context, null, java.lang.String.class, new Class[] {}));
    _jspx_th_af_commandButton_2.setText(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{archemyappviewBundle.CONTINUE}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_af_commandButton_2.setVisible(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{pageFlowScope.expireWarning}", (PageContext)_jspx_page_context, boolean.class, null));
    _jspx_th_af_commandButton_2.setPartialSubmit(org.apache.jasper.runtime.PageContextImpl.getValueExpression("true", (PageContext)_jspx_page_context, boolean.class, null));
    _jspx_th_af_commandButton_2.setId("cb7");
    int _jspx_eval_af_commandButton_2 = _jspx_th_af_commandButton_2.doStartTag();
    if (_jspx_th_af_commandButton_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_commandButton_visible_text_partialSubmit_id_action_nobody.reuse(_jspx_th_af_commandButton_2);
      return true;
    }
    _jspx_tagPool_af_commandButton_visible_text_partialSubmit_id_action_nobody.reuse(_jspx_th_af_commandButton_2);
    return false;
  }

  private boolean _jspx_meth_af_panelGroupLayout_1(javax.servlet.jsp.tagext.JspTag _jspx_th_af_panelGroupLayout_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:panelGroupLayout
    oracle.adfinternal.view.faces.unified.taglib.layout.UnifiedPanelGroupLayoutTag _jspx_th_af_panelGroupLayout_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.unified.taglib.layout.UnifiedPanelGroupLayoutTag.class) : new oracle.adfinternal.view.faces.unified.taglib.layout.UnifiedPanelGroupLayoutTag();
    _jspx_th_af_panelGroupLayout_1.setPageContext(_jspx_page_context);
    _jspx_th_af_panelGroupLayout_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_panelGroupLayout_0);
    _jspx_th_af_panelGroupLayout_1.setJspId("id15");
    _jspx_th_af_panelGroupLayout_1.setId("pg343");
    _jspx_th_af_panelGroupLayout_1.setHalign(org.apache.jasper.runtime.PageContextImpl.getValueExpression("center", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_af_panelGroupLayout_1.setLayout(org.apache.jasper.runtime.PageContextImpl.getValueExpression("vertical", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_af_panelGroupLayout_1 = _jspx_th_af_panelGroupLayout_1.doStartTag();
    if (_jspx_eval_af_panelGroupLayout_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_af_panelGroupLayout_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_af_panelGroupLayout_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_af_panelGroupLayout_1.doInitBody();
      }
      do {
        if (_jspx_meth_af_image_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_panelGroupLayout_1, _jspx_page_context))
          return true;
        if (_jspx_meth_af_panelBox_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_panelGroupLayout_1, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_af_panelGroupLayout_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_af_panelGroupLayout_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_af_panelGroupLayout_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_panelGroupLayout_layout_id_halign.reuse(_jspx_th_af_panelGroupLayout_1);
      return true;
    }
    _jspx_tagPool_af_panelGroupLayout_layout_id_halign.reuse(_jspx_th_af_panelGroupLayout_1);
    return false;
  }

  private boolean _jspx_meth_af_image_0(javax.servlet.jsp.tagext.JspTag _jspx_th_af_panelGroupLayout_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:image
    oracle.adfinternal.view.faces.unified.taglib.output.UnifiedImageTag _jspx_th_af_image_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.unified.taglib.output.UnifiedImageTag.class) : new oracle.adfinternal.view.faces.unified.taglib.output.UnifiedImageTag();
    _jspx_th_af_image_0.setPageContext(_jspx_page_context);
    _jspx_th_af_image_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_panelGroupLayout_1);
    _jspx_th_af_image_0.setJspId("id16");
    _jspx_th_af_image_0.setSource(org.apache.jasper.runtime.PageContextImpl.getValueExpression("/images/archemy_logo.png", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_af_image_0.setId("img1");
    _jspx_th_af_image_0.setShortDesc(org.apache.jasper.runtime.PageContextImpl.getValueExpression("compLogo", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_af_image_0 = _jspx_th_af_image_0.doStartTag();
    if (_jspx_th_af_image_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_image_source_shortDesc_id_nobody.reuse(_jspx_th_af_image_0);
      return true;
    }
    _jspx_tagPool_af_image_source_shortDesc_id_nobody.reuse(_jspx_th_af_image_0);
    return false;
  }

  private boolean _jspx_meth_af_panelBox_0(javax.servlet.jsp.tagext.JspTag _jspx_th_af_panelGroupLayout_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:panelBox
    oracle.adfinternal.view.faces.unified.taglib.layout.UnifiedPanelBoxTag _jspx_th_af_panelBox_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.unified.taglib.layout.UnifiedPanelBoxTag.class) : new oracle.adfinternal.view.faces.unified.taglib.layout.UnifiedPanelBoxTag();
    _jspx_th_af_panelBox_0.setPageContext(_jspx_page_context);
    _jspx_th_af_panelBox_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_panelGroupLayout_1);
    _jspx_th_af_panelBox_0.setJspId("id17");
    _jspx_th_af_panelBox_0.setRamp(org.apache.jasper.runtime.PageContextImpl.getValueExpression("highlight", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_af_panelBox_0.setTitleHalign(org.apache.jasper.runtime.PageContextImpl.getValueExpression("center", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_af_panelBox_0.setShowDisclosure(org.apache.jasper.runtime.PageContextImpl.getValueExpression("false", (PageContext)_jspx_page_context, boolean.class, null));
    _jspx_th_af_panelBox_0.setId("pb1");
    _jspx_th_af_panelBox_0.setText(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{archemyappviewBundle.LOGIN}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_af_panelBox_0 = _jspx_th_af_panelBox_0.doStartTag();
    if (_jspx_eval_af_panelBox_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_af_panelBox_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_af_panelBox_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_af_panelBox_0.doInitBody();
      }
      do {
        if (_jspx_meth_af_spacer_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_panelBox_0, _jspx_page_context))
          return true;
        if (_jspx_meth_af_panelGroupLayout_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_panelBox_0, _jspx_page_context))
          return true;
        if (_jspx_meth_f_facet_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_panelBox_0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_af_panelBox_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_af_panelBox_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_af_panelBox_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_panelBox_titleHalign_text_showDisclosure_ramp_id.reuse(_jspx_th_af_panelBox_0);
      return true;
    }
    _jspx_tagPool_af_panelBox_titleHalign_text_showDisclosure_ramp_id.reuse(_jspx_th_af_panelBox_0);
    return false;
  }

  private boolean _jspx_meth_af_spacer_2(javax.servlet.jsp.tagext.JspTag _jspx_th_af_panelBox_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:spacer
    oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSpacerTag _jspx_th_af_spacer_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSpacerTag.class) : new oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSpacerTag();
    _jspx_th_af_spacer_2.setPageContext(_jspx_page_context);
    _jspx_th_af_spacer_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_panelBox_0);
    _jspx_th_af_spacer_2.setJspId("id18");
    _jspx_th_af_spacer_2.setId("sp22");
    _jspx_th_af_spacer_2.setHeight(org.apache.jasper.runtime.PageContextImpl.getValueExpression("60", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_af_spacer_2 = _jspx_th_af_spacer_2.doStartTag();
    if (_jspx_th_af_spacer_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_spacer_id_height_nobody.reuse(_jspx_th_af_spacer_2);
      return true;
    }
    _jspx_tagPool_af_spacer_id_height_nobody.reuse(_jspx_th_af_spacer_2);
    return false;
  }

  private boolean _jspx_meth_af_panelGroupLayout_2(javax.servlet.jsp.tagext.JspTag _jspx_th_af_panelBox_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:panelGroupLayout
    oracle.adfinternal.view.faces.unified.taglib.layout.UnifiedPanelGroupLayoutTag _jspx_th_af_panelGroupLayout_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.unified.taglib.layout.UnifiedPanelGroupLayoutTag.class) : new oracle.adfinternal.view.faces.unified.taglib.layout.UnifiedPanelGroupLayoutTag();
    _jspx_th_af_panelGroupLayout_2.setPageContext(_jspx_page_context);
    _jspx_th_af_panelGroupLayout_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_panelBox_0);
    _jspx_th_af_panelGroupLayout_2.setJspId("id19");
    _jspx_th_af_panelGroupLayout_2.setValign(org.apache.jasper.runtime.PageContextImpl.getValueExpression("middle", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_af_panelGroupLayout_2.setStyleClass(org.apache.jasper.runtime.PageContextImpl.getValueExpression("AFStretchWidth", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_af_panelGroupLayout_2.setHalign(org.apache.jasper.runtime.PageContextImpl.getValueExpression("center", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_af_panelGroupLayout_2.setLayout(org.apache.jasper.runtime.PageContextImpl.getValueExpression("vertical", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_af_panelGroupLayout_2.setId("pg2");
    int _jspx_eval_af_panelGroupLayout_2 = _jspx_th_af_panelGroupLayout_2.doStartTag();
    if (_jspx_eval_af_panelGroupLayout_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_af_panelGroupLayout_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_af_panelGroupLayout_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_af_panelGroupLayout_2.doInitBody();
      }
      do {
        if (_jspx_meth_af_inputText_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_panelGroupLayout_2, _jspx_page_context))
          return true;
        if (_jspx_meth_af_spacer_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_panelGroupLayout_2, _jspx_page_context))
          return true;
        if (_jspx_meth_af_inputText_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_panelGroupLayout_2, _jspx_page_context))
          return true;
        if (_jspx_meth_af_spacer_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_panelGroupLayout_2, _jspx_page_context))
          return true;
        if (_jspx_meth_af_inputText_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_panelGroupLayout_2, _jspx_page_context))
          return true;
        if (_jspx_meth_af_spacer_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_panelGroupLayout_2, _jspx_page_context))
          return true;
        if (_jspx_meth_af_commandButton_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_panelGroupLayout_2, _jspx_page_context))
          return true;
        if (_jspx_meth_af_spacer_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_panelGroupLayout_2, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_af_panelGroupLayout_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_af_panelGroupLayout_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_af_panelGroupLayout_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_panelGroupLayout_valign_styleClass_layout_id_halign.reuse(_jspx_th_af_panelGroupLayout_2);
      return true;
    }
    _jspx_tagPool_af_panelGroupLayout_valign_styleClass_layout_id_halign.reuse(_jspx_th_af_panelGroupLayout_2);
    return false;
  }

  private boolean _jspx_meth_af_inputText_0(javax.servlet.jsp.tagext.JspTag _jspx_th_af_panelGroupLayout_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:inputText
    oracle.adfinternal.view.faces.unified.taglib.input.UnifiedInputTextTag _jspx_th_af_inputText_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.unified.taglib.input.UnifiedInputTextTag.class) : new oracle.adfinternal.view.faces.unified.taglib.input.UnifiedInputTextTag();
    _jspx_th_af_inputText_0.setPageContext(_jspx_page_context);
    _jspx_th_af_inputText_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_panelGroupLayout_2);
    _jspx_th_af_inputText_0.setJspId("id20");
    _jspx_th_af_inputText_0.setBinding(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{LoginBean.userName}", (PageContext)_jspx_page_context, javax.faces.component.UIComponent.class, null));
    _jspx_th_af_inputText_0.setMaximumLength(org.apache.jasper.runtime.PageContextImpl.getValueExpression("50", (PageContext)_jspx_page_context, int.class, null));
    _jspx_th_af_inputText_0.setRequired(org.apache.jasper.runtime.PageContextImpl.getValueExpression("true", (PageContext)_jspx_page_context, boolean.class, null));
    _jspx_th_af_inputText_0.setId("it1");
    _jspx_th_af_inputText_0.setLabel(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{archemyappviewBundle.USER_ID}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_af_inputText_0 = _jspx_th_af_inputText_0.doStartTag();
    if (_jspx_th_af_inputText_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_inputText_required_maximumLength_label_id_binding_nobody.reuse(_jspx_th_af_inputText_0);
      return true;
    }
    _jspx_tagPool_af_inputText_required_maximumLength_label_id_binding_nobody.reuse(_jspx_th_af_inputText_0);
    return false;
  }

  private boolean _jspx_meth_af_spacer_3(javax.servlet.jsp.tagext.JspTag _jspx_th_af_panelGroupLayout_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:spacer
    oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSpacerTag _jspx_th_af_spacer_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSpacerTag.class) : new oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSpacerTag();
    _jspx_th_af_spacer_3.setPageContext(_jspx_page_context);
    _jspx_th_af_spacer_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_panelGroupLayout_2);
    _jspx_th_af_spacer_3.setJspId("id21");
    _jspx_th_af_spacer_3.setId("sp24");
    _jspx_th_af_spacer_3.setHeight(org.apache.jasper.runtime.PageContextImpl.getValueExpression("25", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_af_spacer_3 = _jspx_th_af_spacer_3.doStartTag();
    if (_jspx_th_af_spacer_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_spacer_id_height_nobody.reuse(_jspx_th_af_spacer_3);
      return true;
    }
    _jspx_tagPool_af_spacer_id_height_nobody.reuse(_jspx_th_af_spacer_3);
    return false;
  }

  private boolean _jspx_meth_af_inputText_1(javax.servlet.jsp.tagext.JspTag _jspx_th_af_panelGroupLayout_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:inputText
    oracle.adfinternal.view.faces.unified.taglib.input.UnifiedInputTextTag _jspx_th_af_inputText_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.unified.taglib.input.UnifiedInputTextTag.class) : new oracle.adfinternal.view.faces.unified.taglib.input.UnifiedInputTextTag();
    _jspx_th_af_inputText_1.setPageContext(_jspx_page_context);
    _jspx_th_af_inputText_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_panelGroupLayout_2);
    _jspx_th_af_inputText_1.setJspId("id22");
    _jspx_th_af_inputText_1.setBinding(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{LoginBean.password}", (PageContext)_jspx_page_context, javax.faces.component.UIComponent.class, null));
    _jspx_th_af_inputText_1.setMaximumLength(org.apache.jasper.runtime.PageContextImpl.getValueExpression("50", (PageContext)_jspx_page_context, int.class, null));
    _jspx_th_af_inputText_1.setRequired(org.apache.jasper.runtime.PageContextImpl.getValueExpression("true", (PageContext)_jspx_page_context, boolean.class, null));
    _jspx_th_af_inputText_1.setSecret(org.apache.jasper.runtime.PageContextImpl.getValueExpression("true", (PageContext)_jspx_page_context, boolean.class, null));
    _jspx_th_af_inputText_1.setId("it2");
    _jspx_th_af_inputText_1.setLabel(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{archemyappviewBundle.PASSWORD}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_af_inputText_1 = _jspx_th_af_inputText_1.doStartTag();
    if (_jspx_th_af_inputText_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_inputText_secret_required_maximumLength_label_id_binding_nobody.reuse(_jspx_th_af_inputText_1);
      return true;
    }
    _jspx_tagPool_af_inputText_secret_required_maximumLength_label_id_binding_nobody.reuse(_jspx_th_af_inputText_1);
    return false;
  }

  private boolean _jspx_meth_af_spacer_4(javax.servlet.jsp.tagext.JspTag _jspx_th_af_panelGroupLayout_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:spacer
    oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSpacerTag _jspx_th_af_spacer_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSpacerTag.class) : new oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSpacerTag();
    _jspx_th_af_spacer_4.setPageContext(_jspx_page_context);
    _jspx_th_af_spacer_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_panelGroupLayout_2);
    _jspx_th_af_spacer_4.setJspId("id23");
    _jspx_th_af_spacer_4.setId("sp271");
    _jspx_th_af_spacer_4.setHeight(org.apache.jasper.runtime.PageContextImpl.getValueExpression("25", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_af_spacer_4 = _jspx_th_af_spacer_4.doStartTag();
    if (_jspx_th_af_spacer_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_spacer_id_height_nobody.reuse(_jspx_th_af_spacer_4);
      return true;
    }
    _jspx_tagPool_af_spacer_id_height_nobody.reuse(_jspx_th_af_spacer_4);
    return false;
  }

  private boolean _jspx_meth_af_inputText_2(javax.servlet.jsp.tagext.JspTag _jspx_th_af_panelGroupLayout_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:inputText
    oracle.adfinternal.view.faces.unified.taglib.input.UnifiedInputTextTag _jspx_th_af_inputText_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.unified.taglib.input.UnifiedInputTextTag.class) : new oracle.adfinternal.view.faces.unified.taglib.input.UnifiedInputTextTag();
    _jspx_th_af_inputText_2.setPageContext(_jspx_page_context);
    _jspx_th_af_inputText_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_panelGroupLayout_2);
    _jspx_th_af_inputText_2.setJspId("id24");
    _jspx_th_af_inputText_2.setBinding(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{LoginBean.licenseKey}", (PageContext)_jspx_page_context, javax.faces.component.UIComponent.class, null));
    _jspx_th_af_inputText_2.setMaximumLength(org.apache.jasper.runtime.PageContextImpl.getValueExpression("50", (PageContext)_jspx_page_context, int.class, null));
    _jspx_th_af_inputText_2.setRequired(org.apache.jasper.runtime.PageContextImpl.getValueExpression("false", (PageContext)_jspx_page_context, boolean.class, null));
    _jspx_th_af_inputText_2.setSecret(org.apache.jasper.runtime.PageContextImpl.getValueExpression("false", (PageContext)_jspx_page_context, boolean.class, null));
    _jspx_th_af_inputText_2.setId("it3");
    _jspx_th_af_inputText_2.setLabel(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{archemyappviewBundle.LICENSE_KEY}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_af_inputText_2 = _jspx_th_af_inputText_2.doStartTag();
    if (_jspx_th_af_inputText_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_inputText_secret_required_maximumLength_label_id_binding_nobody.reuse(_jspx_th_af_inputText_2);
      return true;
    }
    _jspx_tagPool_af_inputText_secret_required_maximumLength_label_id_binding_nobody.reuse(_jspx_th_af_inputText_2);
    return false;
  }

  private boolean _jspx_meth_af_spacer_5(javax.servlet.jsp.tagext.JspTag _jspx_th_af_panelGroupLayout_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:spacer
    oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSpacerTag _jspx_th_af_spacer_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSpacerTag.class) : new oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSpacerTag();
    _jspx_th_af_spacer_5.setPageContext(_jspx_page_context);
    _jspx_th_af_spacer_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_panelGroupLayout_2);
    _jspx_th_af_spacer_5.setJspId("id25");
    _jspx_th_af_spacer_5.setId("sp28");
    _jspx_th_af_spacer_5.setHeight(org.apache.jasper.runtime.PageContextImpl.getValueExpression("50", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_af_spacer_5 = _jspx_th_af_spacer_5.doStartTag();
    if (_jspx_th_af_spacer_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_spacer_id_height_nobody.reuse(_jspx_th_af_spacer_5);
      return true;
    }
    _jspx_tagPool_af_spacer_id_height_nobody.reuse(_jspx_th_af_spacer_5);
    return false;
  }

  private boolean _jspx_meth_af_commandButton_3(javax.servlet.jsp.tagext.JspTag _jspx_th_af_panelGroupLayout_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:commandButton
    oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandButtonTag _jspx_th_af_commandButton_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandButtonTag.class) : new oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandButtonTag();
    _jspx_th_af_commandButton_3.setPageContext(_jspx_page_context);
    _jspx_th_af_commandButton_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_panelGroupLayout_2);
    _jspx_th_af_commandButton_3.setJspId("id26");
    _jspx_th_af_commandButton_3.setAction(org.apache.jasper.runtime.PageContextImpl.getMethodExpression("#{LoginBean.doLogin}", (PageContext)_jspx_page_context, null, java.lang.String.class, new Class[] {}));
    _jspx_th_af_commandButton_3.setId("cb1");
    _jspx_th_af_commandButton_3.setText(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{archemyappviewBundle.LOGIN}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_af_commandButton_3 = _jspx_th_af_commandButton_3.doStartTag();
    if (_jspx_th_af_commandButton_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_commandButton_text_id_action_nobody.reuse(_jspx_th_af_commandButton_3);
      return true;
    }
    _jspx_tagPool_af_commandButton_text_id_action_nobody.reuse(_jspx_th_af_commandButton_3);
    return false;
  }

  private boolean _jspx_meth_af_spacer_6(javax.servlet.jsp.tagext.JspTag _jspx_th_af_panelGroupLayout_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:spacer
    oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSpacerTag _jspx_th_af_spacer_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSpacerTag.class) : new oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSpacerTag();
    _jspx_th_af_spacer_6.setPageContext(_jspx_page_context);
    _jspx_th_af_spacer_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_panelGroupLayout_2);
    _jspx_th_af_spacer_6.setJspId("id27");
    _jspx_th_af_spacer_6.setId("sp25");
    _jspx_th_af_spacer_6.setHeight(org.apache.jasper.runtime.PageContextImpl.getValueExpression("50", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_af_spacer_6 = _jspx_th_af_spacer_6.doStartTag();
    if (_jspx_th_af_spacer_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_spacer_id_height_nobody.reuse(_jspx_th_af_spacer_6);
      return true;
    }
    _jspx_tagPool_af_spacer_id_height_nobody.reuse(_jspx_th_af_spacer_6);
    return false;
  }

  private boolean _jspx_meth_f_facet_0(javax.servlet.jsp.tagext.JspTag _jspx_th_af_panelBox_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:facet
    javax.faces.webapp.FacetTag _jspx_th_f_facet_0 = (javax.faces.webapp.FacetTag) _jspx_tagPool_f_facet_name_nobody.get(javax.faces.webapp.FacetTag.class);
    _jspx_th_f_facet_0.setPageContext(_jspx_page_context);
    _jspx_th_f_facet_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_panelBox_0);
    _jspx_th_f_facet_0.setName("toolbar");
    int _jspx_eval_f_facet_0 = _jspx_th_f_facet_0.doStartTag();
    if (_jspx_th_f_facet_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_f_facet_name_nobody.reuse(_jspx_th_f_facet_0);
      return true;
    }
    _jspx_tagPool_f_facet_name_nobody.reuse(_jspx_th_f_facet_0);
    return false;
  }

  private boolean _jspx_meth_af_spacer_7(javax.servlet.jsp.tagext.JspTag _jspx_th_af_panelGroupLayout_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:spacer
    oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSpacerTag _jspx_th_af_spacer_7 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSpacerTag.class) : new oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSpacerTag();
    _jspx_th_af_spacer_7.setPageContext(_jspx_page_context);
    _jspx_th_af_spacer_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_panelGroupLayout_0);
    _jspx_th_af_spacer_7.setJspId("id29");
    _jspx_th_af_spacer_7.setId("sp29");
    _jspx_th_af_spacer_7.setHeight(org.apache.jasper.runtime.PageContextImpl.getValueExpression("300", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_af_spacer_7 = _jspx_th_af_spacer_7.doStartTag();
    if (_jspx_th_af_spacer_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_spacer_id_height_nobody.reuse(_jspx_th_af_spacer_7);
      return true;
    }
    _jspx_tagPool_af_spacer_id_height_nobody.reuse(_jspx_th_af_spacer_7);
    return false;
  }
}
