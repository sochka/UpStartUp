#-*- coding: utf-8 -*-
from django.conf.urls import patterns, include, url
from django.conf.urls.static import static
from django.conf import settings
from django.views.generic import TemplateView

from project.apps.base.views import logout_user, StartUpList


from django.contrib import admin
admin.autodiscover()


urlpatterns = patterns('',
    url(r'^$', TemplateView.as_view(template_name="index.html"), name='index_page'),
    url(r'^logout/$', logout_user, name='logout'),
    url(r'^api/startups/$', StartUpList.as_view(), name='startup_list'),
    url(r'^admin/', include(admin.site.urls)),
)


if settings.DEBUG:
    # Django media Localhost web-server
    urlpatterns += static(
        settings.STATIC_URL, document_root=settings.STATIC_ROOT)
    urlpatterns += static(
        settings.MEDIA_URL, document_root=settings.MEDIA_ROOT)
