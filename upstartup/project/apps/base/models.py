# coding: utf-8

from django.db import models
from django.contrib.auth.models import User
from django.utils.translation import ugettext_lazy as _


class Startup(models.Model):
    name = models.TextField(_('Name'), default="Test", null=True, blank=True)
    created_at = models.DateTimeField(_('Created At'), null=True, blank=True)
    updated_at = models.DateTimeField(_('Updated At'), null=True, blank=True)
    link = models.URLField(_('Link'), null=True, blank=True)
    quality = models.IntegerField(name='Quality', null=True, blank=True)
    image = models.ImageField(upload_to='image/', name='Image', null=True, blank=True)
    problem = models.TextField(default="Test", name='Problem', null=True, blank=True)
    idea = models.TextField(default="Test", name='Idea', null=True, blank=True)
    description = models.TextField(default="Test", name='Description', null=True, blank=True)
    audience = models.TextField(default="Test", name='Audience', null=True, blank=True)
    use_cases = models.TextField(default="Test", name='Use Cases', null=True, blank=True)
    prod_mark = models.TextField(default="Test", name='Prod Mark', null=True, blank=True)
    benefits = models.TextField(default="Test", name='Benefits', null=True, blank=True)
    competition = models.TextField(default="Test", name='Competition', null=True, blank=True)
    strategy = models.TextField(default="Test", name='Strategy', null=True, blank=True)
    promotion = models.TextField(default="Test", name='Promotion', null=True, blank=True)
    business = models.TextField(default="Test", name='Business', null=True, blank=True)
    milestones = models.TextField(default="Test", name='Milestones', null=True, blank=True)
    risks = models.TextField(default="Test", name='Risks', null=True, blank=True)
    management = models.TextField(default="Test", name='Management', null=True, blank=True)
    technologies = models.TextField(default="Test", name='Technologies', null=True, blank=True)
    jobs = models.TextField(default="Test", name='Jobs', null=True, blank=True)

    def __unicode__(self):
        return '{}'.format(self.id)


