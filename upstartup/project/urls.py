#-*- coding: utf-8 -*-
from django.conf.urls import patterns, include, url
from django.conf.urls.static import static
from django.conf import settings
from django.views.generic import TemplateView
from rest_framework import routers

from project.apps.base.views import logout_user, StartUpViewSet


from django.contrib import admin
admin.autodiscover()


router = routers.DefaultRouter()
router.register(r'startup', StartUpViewSet)


urlpatterns = patterns('',
    url(r'^$', TemplateView.as_view(template_name="index.html"), name='index_page'),
    url(r'^api/', include(router.urls)),
    url(r'^logout/$', logout_user, name='logout'),
    url(r'^admin/', include(admin.site.urls)),
    url(r'^addstartup/$', TemplateView.as_view(template_name="Registartion.html"), name='projectRegistartion'),
    url(r'^startups/$', TemplateView.as_view(template_name="list.html"), name='startups'),
    url(r'^profile/$', TemplateView.as_view(template_name="ProjectProfile.html"), name='ProjectProfile'),
)


if settings.DEBUG:
    # Django media Localhost web-server
    urlpatterns += static(
        settings.STATIC_URL, document_root=settings.STATIC_ROOT)
    urlpatterns += static(
        settings.MEDIA_URL, document_root=settings.MEDIA_ROOT)
