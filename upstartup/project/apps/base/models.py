# coding: utf-8

from django.db import models
from django.contrib.auth.models import User


class Startup(models.Model):
    owner = models.ForeignKey(User, unique=True, name='Owner')
    name = models.TextField(name='Name')
    created_at = models.DateTimeField(name='Created At')
    updated_at = models.DateTimeField(name='Updated At')
    link = models.URLField(name='Link')
    quality = models.IntegerField(name='Quality')
    image = models.ImageField(upload_to='/', name='Image')
    problem = models.TextField(name='Problem')
    idea = models.TextField(name='Idea')
    description = models.TextField(name='Description')
    audience = models.TextField(name='Audience')
    use_cases = models.TextField(name='Use Cases')
    prod_mark = models.TextField(name='Prod Mark')
    benefits = models.TextField(name='Benefits')
    competition = models.TextField(name='Competition')
    strategy = models.TextField(name='Strategy')
    promotion = models.TextField(name='Promotion')
    business = models.TextField(name='Business')
    milestones = models.TextField(name='Milestones')
    risks = models.TextField(name='Risks')
    management = models.TextField(name='Management')
    technologies = models.TextField(name='Technologies')
    jobs = models.TextField(name='Jobs')

    def __unicode__(self):
        return '{}'.format(self.id)