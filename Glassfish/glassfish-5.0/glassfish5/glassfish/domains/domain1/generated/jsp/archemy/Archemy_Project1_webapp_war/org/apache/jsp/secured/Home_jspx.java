package org.apache.jsp.secured;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jspx extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_af_inputText_wrap_value_readOnly_id_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_af_spacer_id_height_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_af_popup_id_clientComponent_childCreation_binding_animate;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_af_commandLink_visible_text_id_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_af_region_value_partialTriggers_id_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_af_commandButton_text_immediate_id_action_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_facet_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_af_commandLink_visible_text_immediate_id_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_af_panelStretchLayout_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_view;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_af_spacer_width_id_height_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_af_messages_id_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_af_dialog_type_title_id_closeIconVisible;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_af_toolbar_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_af_form_usesUpload_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_af_commandLink_visible_text_immediate_id_action_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_af_setPropertyListener_type_to_from_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_af_commandLink_text_immediate_id_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_af_panelGroupLayout_layout_inlineStyle_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_af_pageTemplate_viewId_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_attribute_value_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_af_document_title_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_af_panelGroupLayout_valign_styleClass_layout_id_halign;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_af_showDetail_visible_undisclosedText_id_disclosedText_disclosed;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_af_inputText_wrap_value_readOnly_id_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_af_spacer_id_height_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_af_popup_id_clientComponent_childCreation_binding_animate = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_af_commandLink_visible_text_id_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_af_region_value_partialTriggers_id_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_af_commandButton_text_immediate_id_action_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_f_facet_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_af_commandLink_visible_text_immediate_id_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_af_panelStretchLayout_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_f_view = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_af_spacer_width_id_height_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_af_messages_id_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_af_dialog_type_title_id_closeIconVisible = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_af_toolbar_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_af_form_usesUpload_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_af_commandLink_visible_text_immediate_id_action_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_af_setPropertyListener_type_to_from_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_af_commandLink_text_immediate_id_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_af_panelGroupLayout_layout_inlineStyle_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_af_pageTemplate_viewId_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_f_attribute_value_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_af_document_title_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_af_panelGroupLayout_valign_styleClass_layout_id_halign = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_af_showDetail_visible_undisclosedText_id_disclosedText_disclosed = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_af_inputText_wrap_value_readOnly_id_nobody.release();
    _jspx_tagPool_af_spacer_id_height_nobody.release();
    _jspx_tagPool_af_popup_id_clientComponent_childCreation_binding_animate.release();
    _jspx_tagPool_af_commandLink_visible_text_id_action.release();
    _jspx_tagPool_af_region_value_partialTriggers_id_nobody.release();
    _jspx_tagPool_af_commandButton_text_immediate_id_action_nobody.release();
    _jspx_tagPool_f_facet_name.release();
    _jspx_tagPool_af_commandLink_visible_text_immediate_id_action.release();
    _jspx_tagPool_af_panelStretchLayout_id.release();
    _jspx_tagPool_f_view.release();
    _jspx_tagPool_af_spacer_width_id_height_nobody.release();
    _jspx_tagPool_af_messages_id_nobody.release();
    _jspx_tagPool_af_dialog_type_title_id_closeIconVisible.release();
    _jspx_tagPool_af_toolbar_id.release();
    _jspx_tagPool_af_form_usesUpload_id.release();
    _jspx_tagPool_af_commandLink_visible_text_immediate_id_action_nobody.release();
    _jspx_tagPool_af_setPropertyListener_type_to_from_nobody.release();
    _jspx_tagPool_af_commandLink_text_immediate_id_action.release();
    _jspx_tagPool_af_panelGroupLayout_layout_inlineStyle_id.release();
    _jspx_tagPool_af_pageTemplate_viewId_id.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_f_attribute_value_name_nobody.release();
    _jspx_tagPool_af_document_title_id.release();
    _jspx_tagPool_af_panelGroupLayout_valign_styleClass_layout_id_halign.release();
    _jspx_tagPool_af_showDetail_visible_undisclosedText_id_disclosedText_disclosed.release();
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
    _jspx_th_af_document_0.setTitle(org.apache.jasper.runtime.PageContextImpl.getValueExpression("Home", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_af_document_0 = _jspx_th_af_document_0.doStartTag();
    if (_jspx_eval_af_document_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_af_document_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_af_document_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_af_document_0.doInitBody();
      }
      do {
        if (_jspx_meth_af_messages_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_document_0, _jspx_page_context))
          return true;
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

  private boolean _jspx_meth_af_messages_0(javax.servlet.jsp.tagext.JspTag _jspx_th_af_document_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:messages
    oracle.adfinternal.view.faces.unified.taglib.output.UnifiedMessagesTag _jspx_th_af_messages_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.unified.taglib.output.UnifiedMessagesTag.class) : new oracle.adfinternal.view.faces.unified.taglib.output.UnifiedMessagesTag();
    _jspx_th_af_messages_0.setPageContext(_jspx_page_context);
    _jspx_th_af_messages_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_document_0);
    _jspx_th_af_messages_0.setJspId("id5");
    _jspx_th_af_messages_0.setId("m1");
    int _jspx_eval_af_messages_0 = _jspx_th_af_messages_0.doStartTag();
    if (_jspx_th_af_messages_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_messages_id_nobody.reuse(_jspx_th_af_messages_0);
      return true;
    }
    _jspx_tagPool_af_messages_id_nobody.reuse(_jspx_th_af_messages_0);
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
    _jspx_th_af_form_0.setJspId("id6");
    _jspx_th_af_form_0.setUsesUpload(org.apache.jasper.runtime.PageContextImpl.getValueExpression("true", (PageContext)_jspx_page_context, boolean.class, null));
    _jspx_th_af_form_0.setId("f1");
    int _jspx_eval_af_form_0 = _jspx_th_af_form_0.doStartTag();
    if (_jspx_eval_af_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_af_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_af_form_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_af_form_0.doInitBody();
      }
      do {
        if (_jspx_meth_af_pageTemplate_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_form_0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_af_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_af_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_af_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_form_usesUpload_id.reuse(_jspx_th_af_form_0);
      return true;
    }
    _jspx_tagPool_af_form_usesUpload_id.reuse(_jspx_th_af_form_0);
    return false;
  }

  private boolean _jspx_meth_af_pageTemplate_0(javax.servlet.jsp.tagext.JspTag _jspx_th_af_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:pageTemplate
    oracle.adfinternal.view.faces.taglib.region.PageTemplateTag _jspx_th_af_pageTemplate_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.taglib.region.PageTemplateTag.class) : new oracle.adfinternal.view.faces.taglib.region.PageTemplateTag();
    _jspx_th_af_pageTemplate_0.setPageContext(_jspx_page_context);
    _jspx_th_af_pageTemplate_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_form_0);
    _jspx_th_af_pageTemplate_0.setJspId("id7");
    _jspx_th_af_pageTemplate_0.setId("pt1");
    _jspx_th_af_pageTemplate_0.setViewId(org.apache.jasper.runtime.PageContextImpl.getValueExpression("/oracle/templates/threeColumnTemplate.jspx", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_af_pageTemplate_0 = _jspx_th_af_pageTemplate_0.doStartTag();
    if (_jspx_eval_af_pageTemplate_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_af_pageTemplate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_af_pageTemplate_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_af_pageTemplate_0.doInitBody();
      }
      do {
        if (_jspx_meth_f_attribute_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_pageTemplate_0, _jspx_page_context))
          return true;
        if (_jspx_meth_f_attribute_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_pageTemplate_0, _jspx_page_context))
          return true;
        if (_jspx_meth_f_attribute_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_pageTemplate_0, _jspx_page_context))
          return true;
        if (_jspx_meth_f_facet_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_pageTemplate_0, _jspx_page_context))
          return true;
        if (_jspx_meth_f_facet_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_pageTemplate_0, _jspx_page_context))
          return true;
        if (_jspx_meth_f_facet_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_pageTemplate_0, _jspx_page_context))
          return true;
        if (_jspx_meth_f_facet_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_pageTemplate_0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_af_pageTemplate_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_af_pageTemplate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_af_pageTemplate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_pageTemplate_viewId_id.reuse(_jspx_th_af_pageTemplate_0);
      return true;
    }
    _jspx_tagPool_af_pageTemplate_viewId_id.reuse(_jspx_th_af_pageTemplate_0);
    return false;
  }

  private boolean _jspx_meth_f_attribute_0(javax.servlet.jsp.tagext.JspTag _jspx_th_af_pageTemplate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:attribute
    com.sun.faces.taglib.jsf_core.AttributeTag _jspx_th_f_attribute_0 = (com.sun.faces.taglib.jsf_core.AttributeTag) _jspx_tagPool_f_attribute_value_name_nobody.get(com.sun.faces.taglib.jsf_core.AttributeTag.class);
    _jspx_th_f_attribute_0.setPageContext(_jspx_page_context);
    _jspx_th_f_attribute_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_pageTemplate_0);
    _jspx_th_f_attribute_0.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("/images/archemy_logo_small.png", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_f_attribute_0.setName(org.apache.jasper.runtime.PageContextImpl.getValueExpression("logoImagePath", (PageContext)_jspx_page_context, java.lang.String.class, null));
    int _jspx_eval_f_attribute_0 = _jspx_th_f_attribute_0.doStartTag();
    if (_jspx_th_f_attribute_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_f_attribute_value_name_nobody.reuse(_jspx_th_f_attribute_0);
      return true;
    }
    _jspx_tagPool_f_attribute_value_name_nobody.reuse(_jspx_th_f_attribute_0);
    return false;
  }

  private boolean _jspx_meth_f_attribute_1(javax.servlet.jsp.tagext.JspTag _jspx_th_af_pageTemplate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:attribute
    com.sun.faces.taglib.jsf_core.AttributeTag _jspx_th_f_attribute_1 = (com.sun.faces.taglib.jsf_core.AttributeTag) _jspx_tagPool_f_attribute_value_name_nobody.get(com.sun.faces.taglib.jsf_core.AttributeTag.class);
    _jspx_th_f_attribute_1.setPageContext(_jspx_page_context);
    _jspx_th_f_attribute_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_pageTemplate_0);
    _jspx_th_f_attribute_1.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("Archemy", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_f_attribute_1.setName(org.apache.jasper.runtime.PageContextImpl.getValueExpression("logoShortDesc", (PageContext)_jspx_page_context, java.lang.String.class, null));
    int _jspx_eval_f_attribute_1 = _jspx_th_f_attribute_1.doStartTag();
    if (_jspx_th_f_attribute_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_f_attribute_value_name_nobody.reuse(_jspx_th_f_attribute_1);
      return true;
    }
    _jspx_tagPool_f_attribute_value_name_nobody.reuse(_jspx_th_f_attribute_1);
    return false;
  }

  private boolean _jspx_meth_f_attribute_2(javax.servlet.jsp.tagext.JspTag _jspx_th_af_pageTemplate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:attribute
    com.sun.faces.taglib.jsf_core.AttributeTag _jspx_th_f_attribute_2 = (com.sun.faces.taglib.jsf_core.AttributeTag) _jspx_tagPool_f_attribute_value_name_nobody.get(com.sun.faces.taglib.jsf_core.AttributeTag.class);
    _jspx_th_f_attribute_2.setPageContext(_jspx_page_context);
    _jspx_th_f_attribute_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_pageTemplate_0);
    _jspx_th_f_attribute_2.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("50", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_f_attribute_2.setName(org.apache.jasper.runtime.PageContextImpl.getValueExpression("headerGlobalSize", (PageContext)_jspx_page_context, java.lang.String.class, null));
    int _jspx_eval_f_attribute_2 = _jspx_th_f_attribute_2.doStartTag();
    if (_jspx_th_f_attribute_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_f_attribute_value_name_nobody.reuse(_jspx_th_f_attribute_2);
      return true;
    }
    _jspx_tagPool_f_attribute_value_name_nobody.reuse(_jspx_th_f_attribute_2);
    return false;
  }

  private boolean _jspx_meth_f_facet_0(javax.servlet.jsp.tagext.JspTag _jspx_th_af_pageTemplate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:facet
    javax.faces.webapp.FacetTag _jspx_th_f_facet_0 = (javax.faces.webapp.FacetTag) _jspx_tagPool_f_facet_name.get(javax.faces.webapp.FacetTag.class);
    _jspx_th_f_facet_0.setPageContext(_jspx_page_context);
    _jspx_th_f_facet_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_pageTemplate_0);
    _jspx_th_f_facet_0.setName("start");
    int _jspx_eval_f_facet_0 = _jspx_th_f_facet_0.doStartTag();
    if (_jspx_eval_f_facet_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_af_panelGroupLayout_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_facet_0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_f_facet_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_f_facet_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_f_facet_name.reuse(_jspx_th_f_facet_0);
      return true;
    }
    _jspx_tagPool_f_facet_name.reuse(_jspx_th_f_facet_0);
    return false;
  }

  private boolean _jspx_meth_af_panelGroupLayout_0(javax.servlet.jsp.tagext.JspTag _jspx_th_f_facet_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:panelGroupLayout
    oracle.adfinternal.view.faces.unified.taglib.layout.UnifiedPanelGroupLayoutTag _jspx_th_af_panelGroupLayout_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.unified.taglib.layout.UnifiedPanelGroupLayoutTag.class) : new oracle.adfinternal.view.faces.unified.taglib.layout.UnifiedPanelGroupLayoutTag();
    _jspx_th_af_panelGroupLayout_0.setPageContext(_jspx_page_context);
    _jspx_th_af_panelGroupLayout_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_facet_0);
    _jspx_th_af_panelGroupLayout_0.setJspId("id12");
    _jspx_th_af_panelGroupLayout_0.setLayout(org.apache.jasper.runtime.PageContextImpl.getValueExpression("scroll", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_af_panelGroupLayout_0.setInlineStyle(org.apache.jasper.runtime.PageContextImpl.getValueExpression("padding:5px", (PageContext)_jspx_page_context, java.lang.Object.class, null));
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
        if (_jspx_meth_af_commandLink_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_panelGroupLayout_0, _jspx_page_context))
          return true;
        if (_jspx_meth_af_spacer_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_panelGroupLayout_0, _jspx_page_context))
          return true;
        if (_jspx_meth_af_commandLink_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_panelGroupLayout_0, _jspx_page_context))
          return true;
        if (_jspx_meth_af_spacer_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_panelGroupLayout_0, _jspx_page_context))
          return true;
        if (_jspx_meth_af_commandLink_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_panelGroupLayout_0, _jspx_page_context))
          return true;
        if (_jspx_meth_af_spacer_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_panelGroupLayout_0, _jspx_page_context))
          return true;
        if (_jspx_meth_af_commandLink_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_panelGroupLayout_0, _jspx_page_context))
          return true;
        if (_jspx_meth_af_spacer_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_panelGroupLayout_0, _jspx_page_context))
          return true;
        if (_jspx_meth_af_commandLink_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_panelGroupLayout_0, _jspx_page_context))
          return true;
        if (_jspx_meth_af_spacer_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_panelGroupLayout_0, _jspx_page_context))
          return true;
        if (_jspx_meth_af_commandLink_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_panelGroupLayout_0, _jspx_page_context))
          return true;
        if (_jspx_meth_af_spacer_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_panelGroupLayout_0, _jspx_page_context))
          return true;
        if (_jspx_meth_af_commandLink_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_panelGroupLayout_0, _jspx_page_context))
          return true;
        if (_jspx_meth_af_spacer_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_panelGroupLayout_0, _jspx_page_context))
          return true;
        if (_jspx_meth_af_commandLink_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_panelGroupLayout_0, _jspx_page_context))
          return true;
        if (_jspx_meth_af_spacer_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_panelGroupLayout_0, _jspx_page_context))
          return true;
        if (_jspx_meth_af_commandLink_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_panelGroupLayout_0, _jspx_page_context))
          return true;
        if (_jspx_meth_af_spacer_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_panelGroupLayout_0, _jspx_page_context))
          return true;
        if (_jspx_meth_af_commandLink_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_panelGroupLayout_0, _jspx_page_context))
          return true;
        if (_jspx_meth_af_popup_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_panelGroupLayout_0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_af_panelGroupLayout_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_af_panelGroupLayout_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_af_panelGroupLayout_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_panelGroupLayout_layout_inlineStyle_id.reuse(_jspx_th_af_panelGroupLayout_0);
      return true;
    }
    _jspx_tagPool_af_panelGroupLayout_layout_inlineStyle_id.reuse(_jspx_th_af_panelGroupLayout_0);
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
    _jspx_th_af_spacer_0.setJspId("id13");
    _jspx_th_af_spacer_0.setHeight(org.apache.jasper.runtime.PageContextImpl.getValueExpression("30", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_af_spacer_0.setId("spbig1");
    int _jspx_eval_af_spacer_0 = _jspx_th_af_spacer_0.doStartTag();
    if (_jspx_th_af_spacer_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_spacer_id_height_nobody.reuse(_jspx_th_af_spacer_0);
      return true;
    }
    _jspx_tagPool_af_spacer_id_height_nobody.reuse(_jspx_th_af_spacer_0);
    return false;
  }

  private boolean _jspx_meth_af_commandLink_0(javax.servlet.jsp.tagext.JspTag _jspx_th_af_panelGroupLayout_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:commandLink
    oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandLinkTag _jspx_th_af_commandLink_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandLinkTag.class) : new oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandLinkTag();
    _jspx_th_af_commandLink_0.setPageContext(_jspx_page_context);
    _jspx_th_af_commandLink_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_panelGroupLayout_0);
    _jspx_th_af_commandLink_0.setJspId("id14");
    _jspx_th_af_commandLink_0.setId("cl1");
    _jspx_th_af_commandLink_0.setAction(org.apache.jasper.runtime.PageContextImpl.getMethodExpression("#{viewScope.NavBacking.checkChanges}", (PageContext)_jspx_page_context, null, java.lang.String.class, new Class[] {}));
    _jspx_th_af_commandLink_0.setImmediate(org.apache.jasper.runtime.PageContextImpl.getValueExpression("true", (PageContext)_jspx_page_context, boolean.class, null));
    _jspx_th_af_commandLink_0.setText(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{archemyappviewBundle.SEARCH_KNOWLEDGE_ARTIFACTS}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_af_commandLink_0 = _jspx_th_af_commandLink_0.doStartTag();
    if (_jspx_eval_af_commandLink_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_af_commandLink_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_af_commandLink_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_af_commandLink_0.doInitBody();
      }
      do {
        if (_jspx_meth_af_setPropertyListener_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_commandLink_0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_af_commandLink_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_af_commandLink_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_af_commandLink_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_commandLink_text_immediate_id_action.reuse(_jspx_th_af_commandLink_0);
      return true;
    }
    _jspx_tagPool_af_commandLink_text_immediate_id_action.reuse(_jspx_th_af_commandLink_0);
    return false;
  }

  private boolean _jspx_meth_af_setPropertyListener_0(javax.servlet.jsp.tagext.JspTag _jspx_th_af_commandLink_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:setPropertyListener
    oracle.adfinternal.view.faces.taglib.listener.SetPropertyListenerTag _jspx_th_af_setPropertyListener_0 = (oracle.adfinternal.view.faces.taglib.listener.SetPropertyListenerTag) _jspx_tagPool_af_setPropertyListener_type_to_from_nobody.get(oracle.adfinternal.view.faces.taglib.listener.SetPropertyListenerTag.class);
    _jspx_th_af_setPropertyListener_0.setPageContext(_jspx_page_context);
    _jspx_th_af_setPropertyListener_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_commandLink_0);
    _jspx_th_af_setPropertyListener_0.setType("action");
    _jspx_th_af_setPropertyListener_0.setFrom(org.apache.jasper.runtime.PageContextImpl.getValueExpression("/WEB-INF/taskflow/search-kad-task-flow-definition.xml#search-kad-task-flow-definition", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_af_setPropertyListener_0.setTo(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{viewScope.NavBacking.taskFlowId}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_af_setPropertyListener_0 = _jspx_th_af_setPropertyListener_0.doStartTag();
    if (_jspx_th_af_setPropertyListener_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_setPropertyListener_type_to_from_nobody.reuse(_jspx_th_af_setPropertyListener_0);
      return true;
    }
    _jspx_tagPool_af_setPropertyListener_type_to_from_nobody.reuse(_jspx_th_af_setPropertyListener_0);
    return false;
  }

  private boolean _jspx_meth_af_spacer_1(javax.servlet.jsp.tagext.JspTag _jspx_th_af_panelGroupLayout_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:spacer
    oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSpacerTag _jspx_th_af_spacer_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSpacerTag.class) : new oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSpacerTag();
    _jspx_th_af_spacer_1.setPageContext(_jspx_page_context);
    _jspx_th_af_spacer_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_panelGroupLayout_0);
    _jspx_th_af_spacer_1.setJspId("id16");
    _jspx_th_af_spacer_1.setHeight(org.apache.jasper.runtime.PageContextImpl.getValueExpression("10", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_af_spacer_1.setId("sp1");
    int _jspx_eval_af_spacer_1 = _jspx_th_af_spacer_1.doStartTag();
    if (_jspx_th_af_spacer_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_spacer_id_height_nobody.reuse(_jspx_th_af_spacer_1);
      return true;
    }
    _jspx_tagPool_af_spacer_id_height_nobody.reuse(_jspx_th_af_spacer_1);
    return false;
  }

  private boolean _jspx_meth_af_commandLink_1(javax.servlet.jsp.tagext.JspTag _jspx_th_af_panelGroupLayout_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:commandLink
    oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandLinkTag _jspx_th_af_commandLink_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandLinkTag.class) : new oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandLinkTag();
    _jspx_th_af_commandLink_1.setPageContext(_jspx_page_context);
    _jspx_th_af_commandLink_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_panelGroupLayout_0);
    _jspx_th_af_commandLink_1.setJspId("id17");
    _jspx_th_af_commandLink_1.setId("cl2");
    _jspx_th_af_commandLink_1.setAction(org.apache.jasper.runtime.PageContextImpl.getMethodExpression("#{viewScope.NavBacking.checkChanges}", (PageContext)_jspx_page_context, null, java.lang.String.class, new Class[] {}));
    _jspx_th_af_commandLink_1.setImmediate(org.apache.jasper.runtime.PageContextImpl.getValueExpression("true", (PageContext)_jspx_page_context, boolean.class, null));
    _jspx_th_af_commandLink_1.setText(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{archemyappviewBundle.SEARCH_OR_ADD_CATALOG}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_af_commandLink_1 = _jspx_th_af_commandLink_1.doStartTag();
    if (_jspx_eval_af_commandLink_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_af_commandLink_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_af_commandLink_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_af_commandLink_1.doInitBody();
      }
      do {
        if (_jspx_meth_af_setPropertyListener_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_commandLink_1, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_af_commandLink_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_af_commandLink_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_af_commandLink_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_commandLink_text_immediate_id_action.reuse(_jspx_th_af_commandLink_1);
      return true;
    }
    _jspx_tagPool_af_commandLink_text_immediate_id_action.reuse(_jspx_th_af_commandLink_1);
    return false;
  }

  private boolean _jspx_meth_af_setPropertyListener_1(javax.servlet.jsp.tagext.JspTag _jspx_th_af_commandLink_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:setPropertyListener
    oracle.adfinternal.view.faces.taglib.listener.SetPropertyListenerTag _jspx_th_af_setPropertyListener_1 = (oracle.adfinternal.view.faces.taglib.listener.SetPropertyListenerTag) _jspx_tagPool_af_setPropertyListener_type_to_from_nobody.get(oracle.adfinternal.view.faces.taglib.listener.SetPropertyListenerTag.class);
    _jspx_th_af_setPropertyListener_1.setPageContext(_jspx_page_context);
    _jspx_th_af_setPropertyListener_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_commandLink_1);
    _jspx_th_af_setPropertyListener_1.setType("action");
    _jspx_th_af_setPropertyListener_1.setFrom(org.apache.jasper.runtime.PageContextImpl.getValueExpression("/WEB-INF/taskflow/search-and-add-catalog-tf.xml#search-and-add-catalog-tf", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_af_setPropertyListener_1.setTo(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{viewScope.NavBacking.taskFlowId}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_af_setPropertyListener_1 = _jspx_th_af_setPropertyListener_1.doStartTag();
    if (_jspx_th_af_setPropertyListener_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_setPropertyListener_type_to_from_nobody.reuse(_jspx_th_af_setPropertyListener_1);
      return true;
    }
    _jspx_tagPool_af_setPropertyListener_type_to_from_nobody.reuse(_jspx_th_af_setPropertyListener_1);
    return false;
  }

  private boolean _jspx_meth_af_spacer_2(javax.servlet.jsp.tagext.JspTag _jspx_th_af_panelGroupLayout_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:spacer
    oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSpacerTag _jspx_th_af_spacer_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSpacerTag.class) : new oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSpacerTag();
    _jspx_th_af_spacer_2.setPageContext(_jspx_page_context);
    _jspx_th_af_spacer_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_panelGroupLayout_0);
    _jspx_th_af_spacer_2.setJspId("id19");
    _jspx_th_af_spacer_2.setHeight(org.apache.jasper.runtime.PageContextImpl.getValueExpression("10", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_af_spacer_2.setId("sp2");
    int _jspx_eval_af_spacer_2 = _jspx_th_af_spacer_2.doStartTag();
    if (_jspx_th_af_spacer_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_spacer_id_height_nobody.reuse(_jspx_th_af_spacer_2);
      return true;
    }
    _jspx_tagPool_af_spacer_id_height_nobody.reuse(_jspx_th_af_spacer_2);
    return false;
  }

  private boolean _jspx_meth_af_commandLink_2(javax.servlet.jsp.tagext.JspTag _jspx_th_af_panelGroupLayout_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:commandLink
    oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandLinkTag _jspx_th_af_commandLink_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandLinkTag.class) : new oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandLinkTag();
    _jspx_th_af_commandLink_2.setPageContext(_jspx_page_context);
    _jspx_th_af_commandLink_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_panelGroupLayout_0);
    _jspx_th_af_commandLink_2.setJspId("id20");
    _jspx_th_af_commandLink_2.setId("cl6");
    _jspx_th_af_commandLink_2.setAction(org.apache.jasper.runtime.PageContextImpl.getMethodExpression("#{viewScope.NavBacking.checkChanges}", (PageContext)_jspx_page_context, null, java.lang.String.class, new Class[] {}));
    _jspx_th_af_commandLink_2.setImmediate(org.apache.jasper.runtime.PageContextImpl.getValueExpression("true", (PageContext)_jspx_page_context, boolean.class, null));
    _jspx_th_af_commandLink_2.setText(org.apache.jasper.runtime.PageContextImpl.getValueExpression("View Usage Statistics", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_af_commandLink_2 = _jspx_th_af_commandLink_2.doStartTag();
    if (_jspx_eval_af_commandLink_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_af_commandLink_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_af_commandLink_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_af_commandLink_2.doInitBody();
      }
      do {
        if (_jspx_meth_af_setPropertyListener_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_commandLink_2, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_af_commandLink_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_af_commandLink_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_af_commandLink_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_commandLink_text_immediate_id_action.reuse(_jspx_th_af_commandLink_2);
      return true;
    }
    _jspx_tagPool_af_commandLink_text_immediate_id_action.reuse(_jspx_th_af_commandLink_2);
    return false;
  }

  private boolean _jspx_meth_af_setPropertyListener_2(javax.servlet.jsp.tagext.JspTag _jspx_th_af_commandLink_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:setPropertyListener
    oracle.adfinternal.view.faces.taglib.listener.SetPropertyListenerTag _jspx_th_af_setPropertyListener_2 = (oracle.adfinternal.view.faces.taglib.listener.SetPropertyListenerTag) _jspx_tagPool_af_setPropertyListener_type_to_from_nobody.get(oracle.adfinternal.view.faces.taglib.listener.SetPropertyListenerTag.class);
    _jspx_th_af_setPropertyListener_2.setPageContext(_jspx_page_context);
    _jspx_th_af_setPropertyListener_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_commandLink_2);
    _jspx_th_af_setPropertyListener_2.setType("action");
    _jspx_th_af_setPropertyListener_2.setFrom(org.apache.jasper.runtime.PageContextImpl.getValueExpression("/WEB-INF/taskflow/view-usage-statistics-tf.xml#view-usage-statistics-tf", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_af_setPropertyListener_2.setTo(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{viewScope.NavBacking.taskFlowId}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_af_setPropertyListener_2 = _jspx_th_af_setPropertyListener_2.doStartTag();
    if (_jspx_th_af_setPropertyListener_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_setPropertyListener_type_to_from_nobody.reuse(_jspx_th_af_setPropertyListener_2);
      return true;
    }
    _jspx_tagPool_af_setPropertyListener_type_to_from_nobody.reuse(_jspx_th_af_setPropertyListener_2);
    return false;
  }

  private boolean _jspx_meth_af_spacer_3(javax.servlet.jsp.tagext.JspTag _jspx_th_af_panelGroupLayout_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:spacer
    oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSpacerTag _jspx_th_af_spacer_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSpacerTag.class) : new oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSpacerTag();
    _jspx_th_af_spacer_3.setPageContext(_jspx_page_context);
    _jspx_th_af_spacer_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_panelGroupLayout_0);
    _jspx_th_af_spacer_3.setJspId("id22");
    _jspx_th_af_spacer_3.setHeight(org.apache.jasper.runtime.PageContextImpl.getValueExpression("10", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_af_spacer_3.setId("sp34");
    int _jspx_eval_af_spacer_3 = _jspx_th_af_spacer_3.doStartTag();
    if (_jspx_th_af_spacer_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_spacer_id_height_nobody.reuse(_jspx_th_af_spacer_3);
      return true;
    }
    _jspx_tagPool_af_spacer_id_height_nobody.reuse(_jspx_th_af_spacer_3);
    return false;
  }

  private boolean _jspx_meth_af_commandLink_3(javax.servlet.jsp.tagext.JspTag _jspx_th_af_panelGroupLayout_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:commandLink
    oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandLinkTag _jspx_th_af_commandLink_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandLinkTag.class) : new oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandLinkTag();
    _jspx_th_af_commandLink_3.setPageContext(_jspx_page_context);
    _jspx_th_af_commandLink_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_panelGroupLayout_0);
    _jspx_th_af_commandLink_3.setJspId("id23");
    _jspx_th_af_commandLink_3.setId("cl7");
    _jspx_th_af_commandLink_3.setAction(org.apache.jasper.runtime.PageContextImpl.getMethodExpression("#{viewScope.NavBacking.checkChanges}", (PageContext)_jspx_page_context, null, java.lang.String.class, new Class[] {}));
    _jspx_th_af_commandLink_3.setVisible(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{FortressAllowed['register-kad-usage:View:Normal']}", (PageContext)_jspx_page_context, boolean.class, null));
    _jspx_th_af_commandLink_3.setImmediate(org.apache.jasper.runtime.PageContextImpl.getValueExpression("true", (PageContext)_jspx_page_context, boolean.class, null));
    _jspx_th_af_commandLink_3.setText(org.apache.jasper.runtime.PageContextImpl.getValueExpression("Register KAD Usage", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_af_commandLink_3 = _jspx_th_af_commandLink_3.doStartTag();
    if (_jspx_eval_af_commandLink_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_af_commandLink_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_af_commandLink_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_af_commandLink_3.doInitBody();
      }
      do {
        if (_jspx_meth_af_setPropertyListener_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_commandLink_3, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_af_commandLink_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_af_commandLink_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_af_commandLink_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_commandLink_visible_text_immediate_id_action.reuse(_jspx_th_af_commandLink_3);
      return true;
    }
    _jspx_tagPool_af_commandLink_visible_text_immediate_id_action.reuse(_jspx_th_af_commandLink_3);
    return false;
  }

  private boolean _jspx_meth_af_setPropertyListener_3(javax.servlet.jsp.tagext.JspTag _jspx_th_af_commandLink_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:setPropertyListener
    oracle.adfinternal.view.faces.taglib.listener.SetPropertyListenerTag _jspx_th_af_setPropertyListener_3 = (oracle.adfinternal.view.faces.taglib.listener.SetPropertyListenerTag) _jspx_tagPool_af_setPropertyListener_type_to_from_nobody.get(oracle.adfinternal.view.faces.taglib.listener.SetPropertyListenerTag.class);
    _jspx_th_af_setPropertyListener_3.setPageContext(_jspx_page_context);
    _jspx_th_af_setPropertyListener_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_commandLink_3);
    _jspx_th_af_setPropertyListener_3.setType("action");
    _jspx_th_af_setPropertyListener_3.setFrom(org.apache.jasper.runtime.PageContextImpl.getValueExpression("/WEB-INF/taskflow/register-kad-usage-task-flow-definition.xml#register-kad-usage-task-flow-definition", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_af_setPropertyListener_3.setTo(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{viewScope.NavBacking.taskFlowId}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_af_setPropertyListener_3 = _jspx_th_af_setPropertyListener_3.doStartTag();
    if (_jspx_th_af_setPropertyListener_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_setPropertyListener_type_to_from_nobody.reuse(_jspx_th_af_setPropertyListener_3);
      return true;
    }
    _jspx_tagPool_af_setPropertyListener_type_to_from_nobody.reuse(_jspx_th_af_setPropertyListener_3);
    return false;
  }

  private boolean _jspx_meth_af_spacer_4(javax.servlet.jsp.tagext.JspTag _jspx_th_af_panelGroupLayout_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:spacer
    oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSpacerTag _jspx_th_af_spacer_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSpacerTag.class) : new oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSpacerTag();
    _jspx_th_af_spacer_4.setPageContext(_jspx_page_context);
    _jspx_th_af_spacer_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_panelGroupLayout_0);
    _jspx_th_af_spacer_4.setJspId("id25");
    _jspx_th_af_spacer_4.setHeight(org.apache.jasper.runtime.PageContextImpl.getValueExpression("10", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_af_spacer_4.setId("sp33");
    int _jspx_eval_af_spacer_4 = _jspx_th_af_spacer_4.doStartTag();
    if (_jspx_th_af_spacer_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_spacer_id_height_nobody.reuse(_jspx_th_af_spacer_4);
      return true;
    }
    _jspx_tagPool_af_spacer_id_height_nobody.reuse(_jspx_th_af_spacer_4);
    return false;
  }

  private boolean _jspx_meth_af_commandLink_4(javax.servlet.jsp.tagext.JspTag _jspx_th_af_panelGroupLayout_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:commandLink
    oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandLinkTag _jspx_th_af_commandLink_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandLinkTag.class) : new oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandLinkTag();
    _jspx_th_af_commandLink_4.setPageContext(_jspx_page_context);
    _jspx_th_af_commandLink_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_panelGroupLayout_0);
    _jspx_th_af_commandLink_4.setJspId("id26");
    _jspx_th_af_commandLink_4.setId("cl3");
    _jspx_th_af_commandLink_4.setAction(org.apache.jasper.runtime.PageContextImpl.getMethodExpression("#{viewScope.NavBacking.checkChanges}", (PageContext)_jspx_page_context, null, java.lang.String.class, new Class[] {}));
    _jspx_th_af_commandLink_4.setVisible(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{FortressAllowed['manage-domains:View:Admin']}", (PageContext)_jspx_page_context, boolean.class, null));
    _jspx_th_af_commandLink_4.setImmediate(org.apache.jasper.runtime.PageContextImpl.getValueExpression("true", (PageContext)_jspx_page_context, boolean.class, null));
    _jspx_th_af_commandLink_4.setText(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{archemyappviewBundle.MANAGE_DOMAINS}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_af_commandLink_4 = _jspx_th_af_commandLink_4.doStartTag();
    if (_jspx_eval_af_commandLink_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_af_commandLink_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_af_commandLink_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_af_commandLink_4.doInitBody();
      }
      do {
        if (_jspx_meth_af_setPropertyListener_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_commandLink_4, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_af_commandLink_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_af_commandLink_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_af_commandLink_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_commandLink_visible_text_immediate_id_action.reuse(_jspx_th_af_commandLink_4);
      return true;
    }
    _jspx_tagPool_af_commandLink_visible_text_immediate_id_action.reuse(_jspx_th_af_commandLink_4);
    return false;
  }

  private boolean _jspx_meth_af_setPropertyListener_4(javax.servlet.jsp.tagext.JspTag _jspx_th_af_commandLink_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:setPropertyListener
    oracle.adfinternal.view.faces.taglib.listener.SetPropertyListenerTag _jspx_th_af_setPropertyListener_4 = (oracle.adfinternal.view.faces.taglib.listener.SetPropertyListenerTag) _jspx_tagPool_af_setPropertyListener_type_to_from_nobody.get(oracle.adfinternal.view.faces.taglib.listener.SetPropertyListenerTag.class);
    _jspx_th_af_setPropertyListener_4.setPageContext(_jspx_page_context);
    _jspx_th_af_setPropertyListener_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_commandLink_4);
    _jspx_th_af_setPropertyListener_4.setType("action");
    _jspx_th_af_setPropertyListener_4.setFrom(org.apache.jasper.runtime.PageContextImpl.getValueExpression("/WEB-INF/taskflow/manage-domains-task-flow-definition.xml#add-domains-task-flow-definition", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_af_setPropertyListener_4.setTo(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{viewScope.NavBacking.taskFlowId}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_af_setPropertyListener_4 = _jspx_th_af_setPropertyListener_4.doStartTag();
    if (_jspx_th_af_setPropertyListener_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_setPropertyListener_type_to_from_nobody.reuse(_jspx_th_af_setPropertyListener_4);
      return true;
    }
    _jspx_tagPool_af_setPropertyListener_type_to_from_nobody.reuse(_jspx_th_af_setPropertyListener_4);
    return false;
  }

  private boolean _jspx_meth_af_spacer_5(javax.servlet.jsp.tagext.JspTag _jspx_th_af_panelGroupLayout_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:spacer
    oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSpacerTag _jspx_th_af_spacer_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSpacerTag.class) : new oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSpacerTag();
    _jspx_th_af_spacer_5.setPageContext(_jspx_page_context);
    _jspx_th_af_spacer_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_panelGroupLayout_0);
    _jspx_th_af_spacer_5.setJspId("id28");
    _jspx_th_af_spacer_5.setHeight(org.apache.jasper.runtime.PageContextImpl.getValueExpression("10", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_af_spacer_5.setId("sp3");
    int _jspx_eval_af_spacer_5 = _jspx_th_af_spacer_5.doStartTag();
    if (_jspx_th_af_spacer_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_spacer_id_height_nobody.reuse(_jspx_th_af_spacer_5);
      return true;
    }
    _jspx_tagPool_af_spacer_id_height_nobody.reuse(_jspx_th_af_spacer_5);
    return false;
  }

  private boolean _jspx_meth_af_commandLink_5(javax.servlet.jsp.tagext.JspTag _jspx_th_af_panelGroupLayout_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:commandLink
    oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandLinkTag _jspx_th_af_commandLink_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandLinkTag.class) : new oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandLinkTag();
    _jspx_th_af_commandLink_5.setPageContext(_jspx_page_context);
    _jspx_th_af_commandLink_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_panelGroupLayout_0);
    _jspx_th_af_commandLink_5.setJspId("id29");
    _jspx_th_af_commandLink_5.setId("cl4");
    _jspx_th_af_commandLink_5.setAction(org.apache.jasper.runtime.PageContextImpl.getMethodExpression("#{viewScope.NavBacking.checkChanges}", (PageContext)_jspx_page_context, null, java.lang.String.class, new Class[] {}));
    _jspx_th_af_commandLink_5.setVisible(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{FortressAllowed['manage-dimensions:View:Admin']}", (PageContext)_jspx_page_context, boolean.class, null));
    _jspx_th_af_commandLink_5.setImmediate(org.apache.jasper.runtime.PageContextImpl.getValueExpression("true", (PageContext)_jspx_page_context, boolean.class, null));
    _jspx_th_af_commandLink_5.setText(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{archemyappviewBundle.MANAGE_DIMENSIONS}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_af_commandLink_5 = _jspx_th_af_commandLink_5.doStartTag();
    if (_jspx_eval_af_commandLink_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_af_commandLink_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_af_commandLink_5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_af_commandLink_5.doInitBody();
      }
      do {
        if (_jspx_meth_af_setPropertyListener_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_commandLink_5, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_af_commandLink_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_af_commandLink_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_af_commandLink_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_commandLink_visible_text_immediate_id_action.reuse(_jspx_th_af_commandLink_5);
      return true;
    }
    _jspx_tagPool_af_commandLink_visible_text_immediate_id_action.reuse(_jspx_th_af_commandLink_5);
    return false;
  }

  private boolean _jspx_meth_af_setPropertyListener_5(javax.servlet.jsp.tagext.JspTag _jspx_th_af_commandLink_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:setPropertyListener
    oracle.adfinternal.view.faces.taglib.listener.SetPropertyListenerTag _jspx_th_af_setPropertyListener_5 = (oracle.adfinternal.view.faces.taglib.listener.SetPropertyListenerTag) _jspx_tagPool_af_setPropertyListener_type_to_from_nobody.get(oracle.adfinternal.view.faces.taglib.listener.SetPropertyListenerTag.class);
    _jspx_th_af_setPropertyListener_5.setPageContext(_jspx_page_context);
    _jspx_th_af_setPropertyListener_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_commandLink_5);
    _jspx_th_af_setPropertyListener_5.setType("action");
    _jspx_th_af_setPropertyListener_5.setFrom(org.apache.jasper.runtime.PageContextImpl.getValueExpression("/WEB-INF/taskflow/manage-dimensions-task-flow-definition.xml#manage-dimensions-task-flow-definition", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_af_setPropertyListener_5.setTo(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{viewScope.NavBacking.taskFlowId}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_af_setPropertyListener_5 = _jspx_th_af_setPropertyListener_5.doStartTag();
    if (_jspx_th_af_setPropertyListener_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_setPropertyListener_type_to_from_nobody.reuse(_jspx_th_af_setPropertyListener_5);
      return true;
    }
    _jspx_tagPool_af_setPropertyListener_type_to_from_nobody.reuse(_jspx_th_af_setPropertyListener_5);
    return false;
  }

  private boolean _jspx_meth_af_spacer_6(javax.servlet.jsp.tagext.JspTag _jspx_th_af_panelGroupLayout_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:spacer
    oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSpacerTag _jspx_th_af_spacer_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSpacerTag.class) : new oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSpacerTag();
    _jspx_th_af_spacer_6.setPageContext(_jspx_page_context);
    _jspx_th_af_spacer_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_panelGroupLayout_0);
    _jspx_th_af_spacer_6.setJspId("id31");
    _jspx_th_af_spacer_6.setHeight(org.apache.jasper.runtime.PageContextImpl.getValueExpression("10", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_af_spacer_6.setId("sp4");
    int _jspx_eval_af_spacer_6 = _jspx_th_af_spacer_6.doStartTag();
    if (_jspx_th_af_spacer_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_spacer_id_height_nobody.reuse(_jspx_th_af_spacer_6);
      return true;
    }
    _jspx_tagPool_af_spacer_id_height_nobody.reuse(_jspx_th_af_spacer_6);
    return false;
  }

  private boolean _jspx_meth_af_commandLink_6(javax.servlet.jsp.tagext.JspTag _jspx_th_af_panelGroupLayout_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:commandLink
    oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandLinkTag _jspx_th_af_commandLink_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandLinkTag.class) : new oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandLinkTag();
    _jspx_th_af_commandLink_6.setPageContext(_jspx_page_context);
    _jspx_th_af_commandLink_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_panelGroupLayout_0);
    _jspx_th_af_commandLink_6.setJspId("id32");
    _jspx_th_af_commandLink_6.setId("cl5");
    _jspx_th_af_commandLink_6.setAction(org.apache.jasper.runtime.PageContextImpl.getMethodExpression("#{viewScope.NavBacking.checkChanges}", (PageContext)_jspx_page_context, null, java.lang.String.class, new Class[] {}));
    _jspx_th_af_commandLink_6.setVisible(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{FortressAllowed['manage-areas:View:Admin']}", (PageContext)_jspx_page_context, boolean.class, null));
    _jspx_th_af_commandLink_6.setImmediate(org.apache.jasper.runtime.PageContextImpl.getValueExpression("true", (PageContext)_jspx_page_context, boolean.class, null));
    _jspx_th_af_commandLink_6.setText(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{archemyappviewBundle.MANAGE_AREAS}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_af_commandLink_6 = _jspx_th_af_commandLink_6.doStartTag();
    if (_jspx_eval_af_commandLink_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_af_commandLink_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_af_commandLink_6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_af_commandLink_6.doInitBody();
      }
      do {
        if (_jspx_meth_af_setPropertyListener_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_commandLink_6, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_af_commandLink_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_af_commandLink_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_af_commandLink_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_commandLink_visible_text_immediate_id_action.reuse(_jspx_th_af_commandLink_6);
      return true;
    }
    _jspx_tagPool_af_commandLink_visible_text_immediate_id_action.reuse(_jspx_th_af_commandLink_6);
    return false;
  }

  private boolean _jspx_meth_af_setPropertyListener_6(javax.servlet.jsp.tagext.JspTag _jspx_th_af_commandLink_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:setPropertyListener
    oracle.adfinternal.view.faces.taglib.listener.SetPropertyListenerTag _jspx_th_af_setPropertyListener_6 = (oracle.adfinternal.view.faces.taglib.listener.SetPropertyListenerTag) _jspx_tagPool_af_setPropertyListener_type_to_from_nobody.get(oracle.adfinternal.view.faces.taglib.listener.SetPropertyListenerTag.class);
    _jspx_th_af_setPropertyListener_6.setPageContext(_jspx_page_context);
    _jspx_th_af_setPropertyListener_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_commandLink_6);
    _jspx_th_af_setPropertyListener_6.setType("action");
    _jspx_th_af_setPropertyListener_6.setFrom(org.apache.jasper.runtime.PageContextImpl.getValueExpression("/WEB-INF/taskflow/manage-areas-task-flow-definition.xml#manage-areas-task-flow-definition", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_af_setPropertyListener_6.setTo(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{viewScope.NavBacking.taskFlowId}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_af_setPropertyListener_6 = _jspx_th_af_setPropertyListener_6.doStartTag();
    if (_jspx_th_af_setPropertyListener_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_setPropertyListener_type_to_from_nobody.reuse(_jspx_th_af_setPropertyListener_6);
      return true;
    }
    _jspx_tagPool_af_setPropertyListener_type_to_from_nobody.reuse(_jspx_th_af_setPropertyListener_6);
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
    _jspx_th_af_spacer_7.setJspId("id34");
    _jspx_th_af_spacer_7.setHeight(org.apache.jasper.runtime.PageContextImpl.getValueExpression("10", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_af_spacer_7.setId("sp55");
    int _jspx_eval_af_spacer_7 = _jspx_th_af_spacer_7.doStartTag();
    if (_jspx_th_af_spacer_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_spacer_id_height_nobody.reuse(_jspx_th_af_spacer_7);
      return true;
    }
    _jspx_tagPool_af_spacer_id_height_nobody.reuse(_jspx_th_af_spacer_7);
    return false;
  }

  private boolean _jspx_meth_af_commandLink_7(javax.servlet.jsp.tagext.JspTag _jspx_th_af_panelGroupLayout_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:commandLink
    oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandLinkTag _jspx_th_af_commandLink_7 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandLinkTag.class) : new oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandLinkTag();
    _jspx_th_af_commandLink_7.setPageContext(_jspx_page_context);
    _jspx_th_af_commandLink_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_panelGroupLayout_0);
    _jspx_th_af_commandLink_7.setJspId("id35");
    _jspx_th_af_commandLink_7.setId("cl9");
    _jspx_th_af_commandLink_7.setAction(org.apache.jasper.runtime.PageContextImpl.getMethodExpression("#{viewScope.NavBacking.checkChanges}", (PageContext)_jspx_page_context, null, java.lang.String.class, new Class[] {}));
    _jspx_th_af_commandLink_7.setImmediate(org.apache.jasper.runtime.PageContextImpl.getValueExpression("true", (PageContext)_jspx_page_context, boolean.class, null));
    _jspx_th_af_commandLink_7.setVisible(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{FortressAllowed['manage-bus-probs:View:Admin']}", (PageContext)_jspx_page_context, boolean.class, null));
    _jspx_th_af_commandLink_7.setText(org.apache.jasper.runtime.PageContextImpl.getValueExpression("Manage Business Problems", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_af_commandLink_7 = _jspx_th_af_commandLink_7.doStartTag();
    if (_jspx_eval_af_commandLink_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_af_commandLink_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_af_commandLink_7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_af_commandLink_7.doInitBody();
      }
      do {
        if (_jspx_meth_af_setPropertyListener_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_commandLink_7, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_af_commandLink_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_af_commandLink_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_af_commandLink_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_commandLink_visible_text_immediate_id_action.reuse(_jspx_th_af_commandLink_7);
      return true;
    }
    _jspx_tagPool_af_commandLink_visible_text_immediate_id_action.reuse(_jspx_th_af_commandLink_7);
    return false;
  }

  private boolean _jspx_meth_af_setPropertyListener_7(javax.servlet.jsp.tagext.JspTag _jspx_th_af_commandLink_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:setPropertyListener
    oracle.adfinternal.view.faces.taglib.listener.SetPropertyListenerTag _jspx_th_af_setPropertyListener_7 = (oracle.adfinternal.view.faces.taglib.listener.SetPropertyListenerTag) _jspx_tagPool_af_setPropertyListener_type_to_from_nobody.get(oracle.adfinternal.view.faces.taglib.listener.SetPropertyListenerTag.class);
    _jspx_th_af_setPropertyListener_7.setPageContext(_jspx_page_context);
    _jspx_th_af_setPropertyListener_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_commandLink_7);
    _jspx_th_af_setPropertyListener_7.setType("action");
    _jspx_th_af_setPropertyListener_7.setFrom(org.apache.jasper.runtime.PageContextImpl.getValueExpression(" /WEB-INF/taskflow/recurring-business-problem-tf.xml#recurring-business-problem-tf", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_af_setPropertyListener_7.setTo(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{viewScope.NavBacking.taskFlowId}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_af_setPropertyListener_7 = _jspx_th_af_setPropertyListener_7.doStartTag();
    if (_jspx_th_af_setPropertyListener_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_setPropertyListener_type_to_from_nobody.reuse(_jspx_th_af_setPropertyListener_7);
      return true;
    }
    _jspx_tagPool_af_setPropertyListener_type_to_from_nobody.reuse(_jspx_th_af_setPropertyListener_7);
    return false;
  }

  private boolean _jspx_meth_af_spacer_8(javax.servlet.jsp.tagext.JspTag _jspx_th_af_panelGroupLayout_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:spacer
    oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSpacerTag _jspx_th_af_spacer_8 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSpacerTag.class) : new oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSpacerTag();
    _jspx_th_af_spacer_8.setPageContext(_jspx_page_context);
    _jspx_th_af_spacer_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_panelGroupLayout_0);
    _jspx_th_af_spacer_8.setJspId("id37");
    _jspx_th_af_spacer_8.setHeight(org.apache.jasper.runtime.PageContextImpl.getValueExpression("10", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_af_spacer_8.setId("sp222");
    int _jspx_eval_af_spacer_8 = _jspx_th_af_spacer_8.doStartTag();
    if (_jspx_th_af_spacer_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_spacer_id_height_nobody.reuse(_jspx_th_af_spacer_8);
      return true;
    }
    _jspx_tagPool_af_spacer_id_height_nobody.reuse(_jspx_th_af_spacer_8);
    return false;
  }

  private boolean _jspx_meth_af_commandLink_8(javax.servlet.jsp.tagext.JspTag _jspx_th_af_panelGroupLayout_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:commandLink
    oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandLinkTag _jspx_th_af_commandLink_8 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandLinkTag.class) : new oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandLinkTag();
    _jspx_th_af_commandLink_8.setPageContext(_jspx_page_context);
    _jspx_th_af_commandLink_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_panelGroupLayout_0);
    _jspx_th_af_commandLink_8.setJspId("id38");
    _jspx_th_af_commandLink_8.setId("cl10");
    _jspx_th_af_commandLink_8.setAction(org.apache.jasper.runtime.PageContextImpl.getMethodExpression("#{viewScope.NavBacking.checkChanges}", (PageContext)_jspx_page_context, null, java.lang.String.class, new Class[] {}));
    _jspx_th_af_commandLink_8.setImmediate(org.apache.jasper.runtime.PageContextImpl.getValueExpression("true", (PageContext)_jspx_page_context, boolean.class, null));
    _jspx_th_af_commandLink_8.setText(org.apache.jasper.runtime.PageContextImpl.getValueExpression("Customer Profile", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_af_commandLink_8.setVisible(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{FortressAllowed['customer-profile:View:Normal']}", (PageContext)_jspx_page_context, boolean.class, null));
    int _jspx_eval_af_commandLink_8 = _jspx_th_af_commandLink_8.doStartTag();
    if (_jspx_eval_af_commandLink_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_af_commandLink_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_af_commandLink_8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_af_commandLink_8.doInitBody();
      }
      do {
        if (_jspx_meth_af_setPropertyListener_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_commandLink_8, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_af_commandLink_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_af_commandLink_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_af_commandLink_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_commandLink_visible_text_immediate_id_action.reuse(_jspx_th_af_commandLink_8);
      return true;
    }
    _jspx_tagPool_af_commandLink_visible_text_immediate_id_action.reuse(_jspx_th_af_commandLink_8);
    return false;
  }

  private boolean _jspx_meth_af_setPropertyListener_8(javax.servlet.jsp.tagext.JspTag _jspx_th_af_commandLink_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:setPropertyListener
    oracle.adfinternal.view.faces.taglib.listener.SetPropertyListenerTag _jspx_th_af_setPropertyListener_8 = (oracle.adfinternal.view.faces.taglib.listener.SetPropertyListenerTag) _jspx_tagPool_af_setPropertyListener_type_to_from_nobody.get(oracle.adfinternal.view.faces.taglib.listener.SetPropertyListenerTag.class);
    _jspx_th_af_setPropertyListener_8.setPageContext(_jspx_page_context);
    _jspx_th_af_setPropertyListener_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_commandLink_8);
    _jspx_th_af_setPropertyListener_8.setType("action");
    _jspx_th_af_setPropertyListener_8.setFrom(org.apache.jasper.runtime.PageContextImpl.getValueExpression("/WEB-INF/taskflow/edit-customer-info-tf.xml#edit-customer-info-tf", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_af_setPropertyListener_8.setTo(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{viewScope.NavBacking.taskFlowId}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_af_setPropertyListener_8 = _jspx_th_af_setPropertyListener_8.doStartTag();
    if (_jspx_th_af_setPropertyListener_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_setPropertyListener_type_to_from_nobody.reuse(_jspx_th_af_setPropertyListener_8);
      return true;
    }
    _jspx_tagPool_af_setPropertyListener_type_to_from_nobody.reuse(_jspx_th_af_setPropertyListener_8);
    return false;
  }

  private boolean _jspx_meth_af_spacer_9(javax.servlet.jsp.tagext.JspTag _jspx_th_af_panelGroupLayout_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:spacer
    oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSpacerTag _jspx_th_af_spacer_9 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSpacerTag.class) : new oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSpacerTag();
    _jspx_th_af_spacer_9.setPageContext(_jspx_page_context);
    _jspx_th_af_spacer_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_panelGroupLayout_0);
    _jspx_th_af_spacer_9.setJspId("id40");
    _jspx_th_af_spacer_9.setHeight(org.apache.jasper.runtime.PageContextImpl.getValueExpression("10", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_af_spacer_9.setId("sp223");
    int _jspx_eval_af_spacer_9 = _jspx_th_af_spacer_9.doStartTag();
    if (_jspx_th_af_spacer_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_spacer_id_height_nobody.reuse(_jspx_th_af_spacer_9);
      return true;
    }
    _jspx_tagPool_af_spacer_id_height_nobody.reuse(_jspx_th_af_spacer_9);
    return false;
  }

  private boolean _jspx_meth_af_commandLink_9(javax.servlet.jsp.tagext.JspTag _jspx_th_af_panelGroupLayout_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:commandLink
    oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandLinkTag _jspx_th_af_commandLink_9 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandLinkTag.class) : new oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandLinkTag();
    _jspx_th_af_commandLink_9.setPageContext(_jspx_page_context);
    _jspx_th_af_commandLink_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_panelGroupLayout_0);
    _jspx_th_af_commandLink_9.setJspId("id41");
    _jspx_th_af_commandLink_9.setId("cl11");
    _jspx_th_af_commandLink_9.setAction(org.apache.jasper.runtime.PageContextImpl.getMethodExpression("#{viewScope.NavBacking.checkChanges}", (PageContext)_jspx_page_context, null, java.lang.String.class, new Class[] {}));
    _jspx_th_af_commandLink_9.setText(org.apache.jasper.runtime.PageContextImpl.getValueExpression("View Customer Info", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_af_commandLink_9.setVisible(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{FortressAllowed['customer-info:View:Admin']}", (PageContext)_jspx_page_context, boolean.class, null));
    int _jspx_eval_af_commandLink_9 = _jspx_th_af_commandLink_9.doStartTag();
    if (_jspx_eval_af_commandLink_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_af_commandLink_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_af_commandLink_9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_af_commandLink_9.doInitBody();
      }
      do {
        if (_jspx_meth_af_setPropertyListener_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_commandLink_9, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_af_commandLink_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_af_commandLink_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_af_commandLink_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_commandLink_visible_text_id_action.reuse(_jspx_th_af_commandLink_9);
      return true;
    }
    _jspx_tagPool_af_commandLink_visible_text_id_action.reuse(_jspx_th_af_commandLink_9);
    return false;
  }

  private boolean _jspx_meth_af_setPropertyListener_9(javax.servlet.jsp.tagext.JspTag _jspx_th_af_commandLink_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:setPropertyListener
    oracle.adfinternal.view.faces.taglib.listener.SetPropertyListenerTag _jspx_th_af_setPropertyListener_9 = (oracle.adfinternal.view.faces.taglib.listener.SetPropertyListenerTag) _jspx_tagPool_af_setPropertyListener_type_to_from_nobody.get(oracle.adfinternal.view.faces.taglib.listener.SetPropertyListenerTag.class);
    _jspx_th_af_setPropertyListener_9.setPageContext(_jspx_page_context);
    _jspx_th_af_setPropertyListener_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_commandLink_9);
    _jspx_th_af_setPropertyListener_9.setType("action");
    _jspx_th_af_setPropertyListener_9.setFrom(org.apache.jasper.runtime.PageContextImpl.getValueExpression("  /WEB-INF/taskflow/view-customer-info-task-flow-definition.xml#view-customer-info-task-flow-definition", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_af_setPropertyListener_9.setTo(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{viewScope.NavBacking.taskFlowId}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_af_setPropertyListener_9 = _jspx_th_af_setPropertyListener_9.doStartTag();
    if (_jspx_th_af_setPropertyListener_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_setPropertyListener_type_to_from_nobody.reuse(_jspx_th_af_setPropertyListener_9);
      return true;
    }
    _jspx_tagPool_af_setPropertyListener_type_to_from_nobody.reuse(_jspx_th_af_setPropertyListener_9);
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
    _jspx_th_af_popup_0.setJspId("id43");
    _jspx_th_af_popup_0.setBinding(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{viewScope.NavBacking.popup}", (PageContext)_jspx_page_context, javax.faces.component.UIComponent.class, null));
    _jspx_th_af_popup_0.setClientComponent(org.apache.jasper.runtime.PageContextImpl.getValueExpression("true", (PageContext)_jspx_page_context, boolean.class, null));
    _jspx_th_af_popup_0.setChildCreation("deferred");
    _jspx_th_af_popup_0.setAnimate(org.apache.jasper.runtime.PageContextImpl.getValueExpression("default", (PageContext)_jspx_page_context, java.lang.Object.class, null));
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
      _jspx_tagPool_af_popup_id_clientComponent_childCreation_binding_animate.reuse(_jspx_th_af_popup_0);
      return true;
    }
    _jspx_tagPool_af_popup_id_clientComponent_childCreation_binding_animate.reuse(_jspx_th_af_popup_0);
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
    _jspx_th_af_dialog_0.setJspId("id44");
    _jspx_th_af_dialog_0.setTitle(org.apache.jasper.runtime.PageContextImpl.getValueExpression("Uncommitted Data Warning", (PageContext)_jspx_page_context, java.lang.Object.class, null));
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
        if (_jspx_meth_f_facet_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_dialog_0, _jspx_page_context))
          return true;
        if (_jspx_meth_af_inputText_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_dialog_0, _jspx_page_context))
          return true;
        if (_jspx_meth_af_spacer_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_dialog_0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_af_dialog_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_af_dialog_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_af_dialog_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_dialog_type_title_id_closeIconVisible.reuse(_jspx_th_af_dialog_0);
      return true;
    }
    _jspx_tagPool_af_dialog_type_title_id_closeIconVisible.reuse(_jspx_th_af_dialog_0);
    return false;
  }

  private boolean _jspx_meth_f_facet_1(javax.servlet.jsp.tagext.JspTag _jspx_th_af_dialog_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:facet
    javax.faces.webapp.FacetTag _jspx_th_f_facet_1 = (javax.faces.webapp.FacetTag) _jspx_tagPool_f_facet_name.get(javax.faces.webapp.FacetTag.class);
    _jspx_th_f_facet_1.setPageContext(_jspx_page_context);
    _jspx_th_f_facet_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_dialog_0);
    _jspx_th_f_facet_1.setName("buttonBar");
    int _jspx_eval_f_facet_1 = _jspx_th_f_facet_1.doStartTag();
    if (_jspx_eval_f_facet_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_af_toolbar_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_facet_1, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_f_facet_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_f_facet_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_f_facet_name.reuse(_jspx_th_f_facet_1);
      return true;
    }
    _jspx_tagPool_f_facet_name.reuse(_jspx_th_f_facet_1);
    return false;
  }

  private boolean _jspx_meth_af_toolbar_0(javax.servlet.jsp.tagext.JspTag _jspx_th_f_facet_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:toolbar
    oracle.adfinternal.view.faces.unified.taglib.layout.UnifiedToolbarTag _jspx_th_af_toolbar_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.unified.taglib.layout.UnifiedToolbarTag.class) : new oracle.adfinternal.view.faces.unified.taglib.layout.UnifiedToolbarTag();
    _jspx_th_af_toolbar_0.setPageContext(_jspx_page_context);
    _jspx_th_af_toolbar_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_facet_1);
    _jspx_th_af_toolbar_0.setJspId("id46");
    _jspx_th_af_toolbar_0.setId("tb1");
    int _jspx_eval_af_toolbar_0 = _jspx_th_af_toolbar_0.doStartTag();
    if (_jspx_eval_af_toolbar_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_af_toolbar_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_af_toolbar_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_af_toolbar_0.doInitBody();
      }
      do {
        if (_jspx_meth_af_commandButton_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_toolbar_0, _jspx_page_context))
          return true;
        if (_jspx_meth_af_commandButton_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_toolbar_0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_af_toolbar_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_af_toolbar_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_af_toolbar_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_toolbar_id.reuse(_jspx_th_af_toolbar_0);
      return true;
    }
    _jspx_tagPool_af_toolbar_id.reuse(_jspx_th_af_toolbar_0);
    return false;
  }

  private boolean _jspx_meth_af_commandButton_0(javax.servlet.jsp.tagext.JspTag _jspx_th_af_toolbar_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:commandButton
    oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandButtonTag _jspx_th_af_commandButton_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandButtonTag.class) : new oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandButtonTag();
    _jspx_th_af_commandButton_0.setPageContext(_jspx_page_context);
    _jspx_th_af_commandButton_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_toolbar_0);
    _jspx_th_af_commandButton_0.setJspId("id47");
    _jspx_th_af_commandButton_0.setAction(org.apache.jasper.runtime.PageContextImpl.getMethodExpression("#{viewScope.NavBacking.okAction}", (PageContext)_jspx_page_context, null, java.lang.String.class, new Class[] {}));
    _jspx_th_af_commandButton_0.setImmediate(org.apache.jasper.runtime.PageContextImpl.getValueExpression("true", (PageContext)_jspx_page_context, boolean.class, null));
    _jspx_th_af_commandButton_0.setText(org.apache.jasper.runtime.PageContextImpl.getValueExpression("OK", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_af_commandButton_0.setId("cb1");
    int _jspx_eval_af_commandButton_0 = _jspx_th_af_commandButton_0.doStartTag();
    if (_jspx_th_af_commandButton_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_commandButton_text_immediate_id_action_nobody.reuse(_jspx_th_af_commandButton_0);
      return true;
    }
    _jspx_tagPool_af_commandButton_text_immediate_id_action_nobody.reuse(_jspx_th_af_commandButton_0);
    return false;
  }

  private boolean _jspx_meth_af_commandButton_1(javax.servlet.jsp.tagext.JspTag _jspx_th_af_toolbar_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:commandButton
    oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandButtonTag _jspx_th_af_commandButton_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandButtonTag.class) : new oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandButtonTag();
    _jspx_th_af_commandButton_1.setPageContext(_jspx_page_context);
    _jspx_th_af_commandButton_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_toolbar_0);
    _jspx_th_af_commandButton_1.setJspId("id48");
    _jspx_th_af_commandButton_1.setAction(org.apache.jasper.runtime.PageContextImpl.getMethodExpression(" ", (PageContext)_jspx_page_context, null, java.lang.String.class, new Class[] {}));
    _jspx_th_af_commandButton_1.setImmediate(org.apache.jasper.runtime.PageContextImpl.getValueExpression("true", (PageContext)_jspx_page_context, boolean.class, null));
    _jspx_th_af_commandButton_1.setText(org.apache.jasper.runtime.PageContextImpl.getValueExpression("CANCEL", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_af_commandButton_1.setId("cb2");
    int _jspx_eval_af_commandButton_1 = _jspx_th_af_commandButton_1.doStartTag();
    if (_jspx_th_af_commandButton_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_commandButton_text_immediate_id_action_nobody.reuse(_jspx_th_af_commandButton_1);
      return true;
    }
    _jspx_tagPool_af_commandButton_text_immediate_id_action_nobody.reuse(_jspx_th_af_commandButton_1);
    return false;
  }

  private boolean _jspx_meth_af_inputText_0(javax.servlet.jsp.tagext.JspTag _jspx_th_af_dialog_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:inputText
    oracle.adfinternal.view.faces.unified.taglib.input.UnifiedInputTextTag _jspx_th_af_inputText_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.unified.taglib.input.UnifiedInputTextTag.class) : new oracle.adfinternal.view.faces.unified.taglib.input.UnifiedInputTextTag();
    _jspx_th_af_inputText_0.setPageContext(_jspx_page_context);
    _jspx_th_af_inputText_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_dialog_0);
    _jspx_th_af_inputText_0.setJspId("id49");
    _jspx_th_af_inputText_0.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("If you click ok changes will be lost.", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_af_inputText_0.setWrap(org.apache.jasper.runtime.PageContextImpl.getValueExpression("hard", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_af_inputText_0.setReadOnly(org.apache.jasper.runtime.PageContextImpl.getValueExpression("true", (PageContext)_jspx_page_context, boolean.class, null));
    _jspx_th_af_inputText_0.setId("opt1");
    int _jspx_eval_af_inputText_0 = _jspx_th_af_inputText_0.doStartTag();
    if (_jspx_th_af_inputText_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_inputText_wrap_value_readOnly_id_nobody.reuse(_jspx_th_af_inputText_0);
      return true;
    }
    _jspx_tagPool_af_inputText_wrap_value_readOnly_id_nobody.reuse(_jspx_th_af_inputText_0);
    return false;
  }

  private boolean _jspx_meth_af_spacer_10(javax.servlet.jsp.tagext.JspTag _jspx_th_af_dialog_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:spacer
    oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSpacerTag _jspx_th_af_spacer_10 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSpacerTag.class) : new oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSpacerTag();
    _jspx_th_af_spacer_10.setPageContext(_jspx_page_context);
    _jspx_th_af_spacer_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_dialog_0);
    _jspx_th_af_spacer_10.setJspId("id50");
    _jspx_th_af_spacer_10.setHeight(org.apache.jasper.runtime.PageContextImpl.getValueExpression("5", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_af_spacer_10.setId("sp122");
    int _jspx_eval_af_spacer_10 = _jspx_th_af_spacer_10.doStartTag();
    if (_jspx_th_af_spacer_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_spacer_id_height_nobody.reuse(_jspx_th_af_spacer_10);
      return true;
    }
    _jspx_tagPool_af_spacer_id_height_nobody.reuse(_jspx_th_af_spacer_10);
    return false;
  }

  private boolean _jspx_meth_f_facet_2(javax.servlet.jsp.tagext.JspTag _jspx_th_af_pageTemplate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:facet
    javax.faces.webapp.FacetTag _jspx_th_f_facet_2 = (javax.faces.webapp.FacetTag) _jspx_tagPool_f_facet_name.get(javax.faces.webapp.FacetTag.class);
    _jspx_th_f_facet_2.setPageContext(_jspx_page_context);
    _jspx_th_f_facet_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_pageTemplate_0);
    _jspx_th_f_facet_2.setName("center");
    int _jspx_eval_f_facet_2 = _jspx_th_f_facet_2.doStartTag();
    if (_jspx_eval_f_facet_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_af_panelStretchLayout_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_facet_2, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_f_facet_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_f_facet_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_f_facet_name.reuse(_jspx_th_f_facet_2);
      return true;
    }
    _jspx_tagPool_f_facet_name.reuse(_jspx_th_f_facet_2);
    return false;
  }

  private boolean _jspx_meth_af_panelStretchLayout_0(javax.servlet.jsp.tagext.JspTag _jspx_th_f_facet_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:panelStretchLayout
    oracle.adfinternal.view.faces.unified.taglib.layout.UnifiedPanelStretchTag _jspx_th_af_panelStretchLayout_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.unified.taglib.layout.UnifiedPanelStretchTag.class) : new oracle.adfinternal.view.faces.unified.taglib.layout.UnifiedPanelStretchTag();
    _jspx_th_af_panelStretchLayout_0.setPageContext(_jspx_page_context);
    _jspx_th_af_panelStretchLayout_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_facet_2);
    _jspx_th_af_panelStretchLayout_0.setJspId("id52");
    _jspx_th_af_panelStretchLayout_0.setId("pd343");
    int _jspx_eval_af_panelStretchLayout_0 = _jspx_th_af_panelStretchLayout_0.doStartTag();
    if (_jspx_eval_af_panelStretchLayout_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_af_panelStretchLayout_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_af_panelStretchLayout_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_af_panelStretchLayout_0.doInitBody();
      }
      do {
        if (_jspx_meth_f_facet_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_panelStretchLayout_0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_af_panelStretchLayout_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_af_panelStretchLayout_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_af_panelStretchLayout_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_panelStretchLayout_id.reuse(_jspx_th_af_panelStretchLayout_0);
      return true;
    }
    _jspx_tagPool_af_panelStretchLayout_id.reuse(_jspx_th_af_panelStretchLayout_0);
    return false;
  }

  private boolean _jspx_meth_f_facet_3(javax.servlet.jsp.tagext.JspTag _jspx_th_af_panelStretchLayout_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:facet
    javax.faces.webapp.FacetTag _jspx_th_f_facet_3 = (javax.faces.webapp.FacetTag) _jspx_tagPool_f_facet_name.get(javax.faces.webapp.FacetTag.class);
    _jspx_th_f_facet_3.setPageContext(_jspx_page_context);
    _jspx_th_f_facet_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_panelStretchLayout_0);
    _jspx_th_f_facet_3.setName("center");
    int _jspx_eval_f_facet_3 = _jspx_th_f_facet_3.doStartTag();
    if (_jspx_eval_f_facet_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_af_region_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_facet_3, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_f_facet_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_f_facet_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_f_facet_name.reuse(_jspx_th_f_facet_3);
      return true;
    }
    _jspx_tagPool_f_facet_name.reuse(_jspx_th_f_facet_3);
    return false;
  }

  private boolean _jspx_meth_af_region_0(javax.servlet.jsp.tagext.JspTag _jspx_th_f_facet_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:region
    oracle.adfinternal.view.faces.taglib.region.RegionTag _jspx_th_af_region_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.taglib.region.RegionTag.class) : new oracle.adfinternal.view.faces.taglib.region.RegionTag();
    _jspx_th_af_region_0.setPageContext(_jspx_page_context);
    _jspx_th_af_region_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_facet_3);
    _jspx_th_af_region_0.setJspId("id54");
    _jspx_th_af_region_0.setPartialTriggers(org.apache.jasper.runtime.PageContextImpl.getValueExpression("::cl1 ::cl2 ::cl3 ::cl4 ::cl5 ::cl6 ::cl7 ::cl9 ::cl9 ::cl10 ::cl11", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_af_region_0.setId("r1");
    _jspx_th_af_region_0.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{bindings.dynamicRegion1.regionModel}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_af_region_0 = _jspx_th_af_region_0.doStartTag();
    if (_jspx_th_af_region_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_region_value_partialTriggers_id_nobody.reuse(_jspx_th_af_region_0);
      return true;
    }
    _jspx_tagPool_af_region_value_partialTriggers_id_nobody.reuse(_jspx_th_af_region_0);
    return false;
  }

  private boolean _jspx_meth_f_facet_4(javax.servlet.jsp.tagext.JspTag _jspx_th_af_pageTemplate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:facet
    javax.faces.webapp.FacetTag _jspx_th_f_facet_4 = (javax.faces.webapp.FacetTag) _jspx_tagPool_f_facet_name.get(javax.faces.webapp.FacetTag.class);
    _jspx_th_f_facet_4.setPageContext(_jspx_page_context);
    _jspx_th_f_facet_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_pageTemplate_0);
    _jspx_th_f_facet_4.setName("end");
    int _jspx_eval_f_facet_4 = _jspx_th_f_facet_4.doStartTag();
    if (_jspx_eval_f_facet_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_af_showDetail_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_facet_4, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_f_facet_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_f_facet_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_f_facet_name.reuse(_jspx_th_f_facet_4);
      return true;
    }
    _jspx_tagPool_f_facet_name.reuse(_jspx_th_f_facet_4);
    return false;
  }

  private boolean _jspx_meth_af_showDetail_0(javax.servlet.jsp.tagext.JspTag _jspx_th_f_facet_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:showDetail
    oracle.adfinternal.view.faces.unified.taglib.layout.UnifiedShowDetailTag _jspx_th_af_showDetail_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.unified.taglib.layout.UnifiedShowDetailTag.class) : new oracle.adfinternal.view.faces.unified.taglib.layout.UnifiedShowDetailTag();
    _jspx_th_af_showDetail_0.setPageContext(_jspx_page_context);
    _jspx_th_af_showDetail_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_facet_4);
    _jspx_th_af_showDetail_0.setJspId("id56");
    _jspx_th_af_showDetail_0.setVisible(org.apache.jasper.runtime.PageContextImpl.getValueExpression("true", (PageContext)_jspx_page_context, boolean.class, null));
    _jspx_th_af_showDetail_0.setUndisclosedText(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{archemyappviewBundle.QUICK_LINKS}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_af_showDetail_0.setDisclosedText(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{archemyappviewBundle.QUICK_LINKS}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_af_showDetail_0.setId("sd2");
    _jspx_th_af_showDetail_0.setDisclosed(org.apache.jasper.runtime.PageContextImpl.getValueExpression("true", (PageContext)_jspx_page_context, boolean.class, null));
    int _jspx_eval_af_showDetail_0 = _jspx_th_af_showDetail_0.doStartTag();
    if (_jspx_eval_af_showDetail_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_af_showDetail_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_af_showDetail_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_af_showDetail_0.doInitBody();
      }
      do {
        if (_jspx_meth_af_spacer_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_showDetail_0, _jspx_page_context))
          return true;
        if (_jspx_meth_af_commandLink_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_showDetail_0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_af_showDetail_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_af_showDetail_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_af_showDetail_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_showDetail_visible_undisclosedText_id_disclosedText_disclosed.reuse(_jspx_th_af_showDetail_0);
      return true;
    }
    _jspx_tagPool_af_showDetail_visible_undisclosedText_id_disclosedText_disclosed.reuse(_jspx_th_af_showDetail_0);
    return false;
  }

  private boolean _jspx_meth_af_spacer_11(javax.servlet.jsp.tagext.JspTag _jspx_th_af_showDetail_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:spacer
    oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSpacerTag _jspx_th_af_spacer_11 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSpacerTag.class) : new oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSpacerTag();
    _jspx_th_af_spacer_11.setPageContext(_jspx_page_context);
    _jspx_th_af_spacer_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_showDetail_0);
    _jspx_th_af_spacer_11.setJspId("id57");
    _jspx_th_af_spacer_11.setId("s1");
    _jspx_th_af_spacer_11.setHeight(org.apache.jasper.runtime.PageContextImpl.getValueExpression("20", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_af_spacer_11.setWidth(org.apache.jasper.runtime.PageContextImpl.getValueExpression("20", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_af_spacer_11 = _jspx_th_af_spacer_11.doStartTag();
    if (_jspx_th_af_spacer_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_spacer_width_id_height_nobody.reuse(_jspx_th_af_spacer_11);
      return true;
    }
    _jspx_tagPool_af_spacer_width_id_height_nobody.reuse(_jspx_th_af_spacer_11);
    return false;
  }

  private boolean _jspx_meth_af_commandLink_10(javax.servlet.jsp.tagext.JspTag _jspx_th_af_showDetail_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:commandLink
    oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandLinkTag _jspx_th_af_commandLink_10 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandLinkTag.class) : new oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandLinkTag();
    _jspx_th_af_commandLink_10.setPageContext(_jspx_page_context);
    _jspx_th_af_commandLink_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_showDetail_0);
    _jspx_th_af_commandLink_10.setJspId("id58");
    _jspx_th_af_commandLink_10.setId("cl8");
    _jspx_th_af_commandLink_10.setAction(org.apache.jasper.runtime.PageContextImpl.getMethodExpression("#{viewScope.NavBacking.checkChanges}", (PageContext)_jspx_page_context, null, java.lang.String.class, new Class[] {}));
    _jspx_th_af_commandLink_10.setImmediate(org.apache.jasper.runtime.PageContextImpl.getValueExpression("true", (PageContext)_jspx_page_context, boolean.class, null));
    _jspx_th_af_commandLink_10.setText(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{archemyappviewBundle.CHANGE_PASSWORD}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_af_commandLink_10 = _jspx_th_af_commandLink_10.doStartTag();
    if (_jspx_eval_af_commandLink_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_af_commandLink_10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_af_commandLink_10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_af_commandLink_10.doInitBody();
      }
      do {
        if (_jspx_meth_af_setPropertyListener_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_commandLink_10, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_af_commandLink_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_af_commandLink_10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_af_commandLink_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_commandLink_text_immediate_id_action.reuse(_jspx_th_af_commandLink_10);
      return true;
    }
    _jspx_tagPool_af_commandLink_text_immediate_id_action.reuse(_jspx_th_af_commandLink_10);
    return false;
  }

  private boolean _jspx_meth_af_setPropertyListener_10(javax.servlet.jsp.tagext.JspTag _jspx_th_af_commandLink_10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:setPropertyListener
    oracle.adfinternal.view.faces.taglib.listener.SetPropertyListenerTag _jspx_th_af_setPropertyListener_10 = (oracle.adfinternal.view.faces.taglib.listener.SetPropertyListenerTag) _jspx_tagPool_af_setPropertyListener_type_to_from_nobody.get(oracle.adfinternal.view.faces.taglib.listener.SetPropertyListenerTag.class);
    _jspx_th_af_setPropertyListener_10.setPageContext(_jspx_page_context);
    _jspx_th_af_setPropertyListener_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_commandLink_10);
    _jspx_th_af_setPropertyListener_10.setTo(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{viewScope.NavBacking.taskFlowId}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_af_setPropertyListener_10.setFrom(org.apache.jasper.runtime.PageContextImpl.getValueExpression("/WEB-INF/taskflow/change-password-task-flow-definition.xml#change-password-task-flow-definition", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_af_setPropertyListener_10.setType("action");
    int _jspx_eval_af_setPropertyListener_10 = _jspx_th_af_setPropertyListener_10.doStartTag();
    if (_jspx_th_af_setPropertyListener_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_setPropertyListener_type_to_from_nobody.reuse(_jspx_th_af_setPropertyListener_10);
      return true;
    }
    _jspx_tagPool_af_setPropertyListener_type_to_from_nobody.reuse(_jspx_th_af_setPropertyListener_10);
    return false;
  }

  private boolean _jspx_meth_f_facet_5(javax.servlet.jsp.tagext.JspTag _jspx_th_af_pageTemplate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:facet
    javax.faces.webapp.FacetTag _jspx_th_f_facet_5 = (javax.faces.webapp.FacetTag) _jspx_tagPool_f_facet_name.get(javax.faces.webapp.FacetTag.class);
    _jspx_th_f_facet_5.setPageContext(_jspx_page_context);
    _jspx_th_f_facet_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_pageTemplate_0);
    _jspx_th_f_facet_5.setName("status");
    int _jspx_eval_f_facet_5 = _jspx_th_f_facet_5.doStartTag();
    if (_jspx_eval_f_facet_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_af_panelGroupLayout_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_facet_5, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_f_facet_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_f_facet_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_f_facet_name.reuse(_jspx_th_f_facet_5);
      return true;
    }
    _jspx_tagPool_f_facet_name.reuse(_jspx_th_f_facet_5);
    return false;
  }

  private boolean _jspx_meth_af_panelGroupLayout_1(javax.servlet.jsp.tagext.JspTag _jspx_th_f_facet_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:panelGroupLayout
    oracle.adfinternal.view.faces.unified.taglib.layout.UnifiedPanelGroupLayoutTag _jspx_th_af_panelGroupLayout_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.unified.taglib.layout.UnifiedPanelGroupLayoutTag.class) : new oracle.adfinternal.view.faces.unified.taglib.layout.UnifiedPanelGroupLayoutTag();
    _jspx_th_af_panelGroupLayout_1.setPageContext(_jspx_page_context);
    _jspx_th_af_panelGroupLayout_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_facet_5);
    _jspx_th_af_panelGroupLayout_1.setJspId("id61");
    _jspx_th_af_panelGroupLayout_1.setHalign(org.apache.jasper.runtime.PageContextImpl.getValueExpression("right", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_af_panelGroupLayout_1.setValign(org.apache.jasper.runtime.PageContextImpl.getValueExpression("bottom", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_af_panelGroupLayout_1.setStyleClass(org.apache.jasper.runtime.PageContextImpl.getValueExpression("AFStretchWidth", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_af_panelGroupLayout_1.setId("pg65");
    _jspx_th_af_panelGroupLayout_1.setLayout(org.apache.jasper.runtime.PageContextImpl.getValueExpression("horizontal", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_af_panelGroupLayout_1 = _jspx_th_af_panelGroupLayout_1.doStartTag();
    if (_jspx_eval_af_panelGroupLayout_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_af_panelGroupLayout_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_af_panelGroupLayout_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_af_panelGroupLayout_1.doInitBody();
      }
      do {
        if (_jspx_meth_af_commandLink_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_af_panelGroupLayout_1, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_af_panelGroupLayout_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_af_panelGroupLayout_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_af_panelGroupLayout_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_panelGroupLayout_valign_styleClass_layout_id_halign.reuse(_jspx_th_af_panelGroupLayout_1);
      return true;
    }
    _jspx_tagPool_af_panelGroupLayout_valign_styleClass_layout_id_halign.reuse(_jspx_th_af_panelGroupLayout_1);
    return false;
  }

  private boolean _jspx_meth_af_commandLink_11(javax.servlet.jsp.tagext.JspTag _jspx_th_af_panelGroupLayout_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  af:commandLink
    oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandLinkTag _jspx_th_af_commandLink_11 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandLinkTag.class) : new oracle.adfinternal.view.faces.unified.taglib.nav.UnifiedCommandLinkTag();
    _jspx_th_af_commandLink_11.setPageContext(_jspx_page_context);
    _jspx_th_af_commandLink_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_af_panelGroupLayout_1);
    _jspx_th_af_commandLink_11.setJspId("id62");
    _jspx_th_af_commandLink_11.setId("c56");
    _jspx_th_af_commandLink_11.setAction(org.apache.jasper.runtime.PageContextImpl.getMethodExpression("#{LoginBean.doLogout}", (PageContext)_jspx_page_context, null, java.lang.String.class, new Class[] {}));
    _jspx_th_af_commandLink_11.setImmediate(org.apache.jasper.runtime.PageContextImpl.getValueExpression("true", (PageContext)_jspx_page_context, boolean.class, null));
    _jspx_th_af_commandLink_11.setVisible(org.apache.jasper.runtime.PageContextImpl.getValueExpression("true", (PageContext)_jspx_page_context, boolean.class, null));
    _jspx_th_af_commandLink_11.setText(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{archemyappviewBundle.LOGOUT}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_af_commandLink_11 = _jspx_th_af_commandLink_11.doStartTag();
    if (_jspx_th_af_commandLink_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_af_commandLink_visible_text_immediate_id_action_nobody.reuse(_jspx_th_af_commandLink_11);
      return true;
    }
    _jspx_tagPool_af_commandLink_visible_text_immediate_id_action_nobody.reuse(_jspx_th_af_commandLink_11);
    return false;
  }
}
