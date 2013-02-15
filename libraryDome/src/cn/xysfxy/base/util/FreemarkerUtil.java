package cn.xysfxy.base.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Locale;

import javax.servlet.ServletContext;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class FreemarkerUtil {
	/**
	 * ���ɾ�̬ҳ��������
	 * 
	 * @param context
	 *            ServletContext
	 * @param data
	 * @param templatePath
	 *            ftlģ��·��
	 * @param targetHtmlPath
	 *            ���ɾ�̬ҳ���·��
	 */
	public static void crateHTML(ServletContext context, Object data,
			String templatePath, String targetHtmlPath) {
		Configuration freemarkerCfg = new Configuration();
		// ����ģ��
		freemarkerCfg.setServletContextForTemplateLoading(context, "/");
		freemarkerCfg.setEncoding(Locale.getDefault(), "UTF-8");
		Writer out = null;
		try {
			// ָ��ģ��·��
			Template template = freemarkerCfg
					.getTemplate(templatePath, "UTF-8");
			template.setEncoding("UTF-8");
			// ��̬ҳ��·��
			String htmlPath = context.getRealPath("/html") + "/"
					+ targetHtmlPath;
			File htmlFile = new File(htmlPath);
			out = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(htmlFile), "UTF-8"));
			// ����ģ��
			template.process(data, out);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.flush();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if (out != null) {
					out.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
