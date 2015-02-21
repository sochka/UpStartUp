# coding: utf-8

from django.db import models
from django.contrib.auth.models import User
from django.utils.translation import ugettext_lazy as _


class Startup(models.Model):
    name = models.TextField(_('Name'), default="Test")
    created_at = models.DateTimeField(_('Created At'))
    updated_at = models.DateTimeField(_('Updated At'))
    link = models.URLField(_('Link'))
    quality = models.IntegerField(name='Quality')
    image = models.ImageField(upload_to='image/', name='Image')
    problem = models.TextField(default="Test", name='Problem')
    idea = models.TextField(default="Test", name='Idea')
    description = models.TextField(default="Test", name='Description')
    audience = models.TextField(default="Test", name='Audience')
    use_cases = models.TextField(default="Test", name='Use Cases')
    prod_mark = models.TextField(default="Test", name='Prod Mark')
    benefits = models.TextField(default="Test", name='Benefits')
    competition = models.TextField(default="Test", name='Competition')
    strategy = models.TextField(default="Test", name='Strategy')
    promotion = models.TextField(default="Test", name='Promotion')
    business = models.TextField(default="Test", name='Business')
    milestones = models.TextField(default="Test", name='Milestones')
    risks = models.TextField(default="Test", name='Risks')
    management = models.TextField(default="Test", name='Management')
    technologies = models.TextField(default="Test", name='Technologies')
    jobs = models.TextField(default="Test", name='Jobs')

    def __unicode__(self):
        return '{}'.format(self.id)


