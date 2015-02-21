# -*- coding: utf-8 -*-
from south.utils import datetime_utils as datetime
from south.db import db
from south.v2 import SchemaMigration
from django.db import models


class Migration(SchemaMigration):

    def forwards(self, orm):
        # Adding model 'Startup'
        db.create_table(u'base_startup', (
            (u'id', self.gf('django.db.models.fields.AutoField')(primary_key=True)),
            ('Owner', self.gf('django.db.models.fields.related.ForeignKey')(to=orm['auth.User'], unique=True)),
            ('Name', self.gf('django.db.models.fields.TextField')()),
            ('Created At', self.gf('django.db.models.fields.DateTimeField')()),
            ('Updated At', self.gf('django.db.models.fields.DateTimeField')()),
            ('Link', self.gf('django.db.models.fields.URLField')(max_length=200)),
            ('Quality', self.gf('django.db.models.fields.IntegerField')()),
            ('Image', self.gf('django.db.models.fields.files.ImageField')(max_length=100)),
            ('Problem', self.gf('django.db.models.fields.TextField')()),
            ('Idea', self.gf('django.db.models.fields.TextField')()),
            ('Description', self.gf('django.db.models.fields.TextField')()),
            ('Audience', self.gf('django.db.models.fields.TextField')()),
            ('Use Cases', self.gf('django.db.models.fields.TextField')()),
            ('Prod Mark', self.gf('django.db.models.fields.TextField')()),
            ('Benefits', self.gf('django.db.models.fields.TextField')()),
            ('Competition', self.gf('django.db.models.fields.TextField')()),
            ('Strategy', self.gf('django.db.models.fields.TextField')()),
            ('Promotion', self.gf('django.db.models.fields.TextField')()),
            ('Business', self.gf('django.db.models.fields.TextField')()),
            ('Milestones', self.gf('django.db.models.fields.TextField')()),
            ('Risks', self.gf('django.db.models.fields.TextField')()),
            ('Management', self.gf('django.db.models.fields.TextField')()),
            ('Technologies', self.gf('django.db.models.fields.TextField')()),
            ('Jobs', self.gf('django.db.models.fields.TextField')()),
        ))
        db.send_create_signal(u'base', ['Startup'])


    def backwards(self, orm):
        # Deleting model 'Startup'
        db.delete_table(u'base_startup')


    models = {
        u'auth.group': {
            'Meta': {'object_name': 'Group'},
            u'id': ('django.db.models.fields.AutoField', [], {'primary_key': 'True'}),
            'name': ('django.db.models.fields.CharField', [], {'unique': 'True', 'max_length': '80'}),
            'permissions': ('django.db.models.fields.related.ManyToManyField', [], {'to': u"orm['auth.Permission']", 'symmetrical': 'False', 'blank': 'True'})
        },
        u'auth.permission': {
            'Meta': {'ordering': "(u'content_type__app_label', u'content_type__model', u'codename')", 'unique_together': "((u'content_type', u'codename'),)", 'object_name': 'Permission'},
            'codename': ('django.db.models.fields.CharField', [], {'max_length': '100'}),
            'content_type': ('django.db.models.fields.related.ForeignKey', [], {'to': u"orm['contenttypes.ContentType']"}),
            u'id': ('django.db.models.fields.AutoField', [], {'primary_key': 'True'}),
            'name': ('django.db.models.fields.CharField', [], {'max_length': '50'})
        },
        u'auth.user': {
            'Meta': {'object_name': 'User'},
            'date_joined': ('django.db.models.fields.DateTimeField', [], {'default': 'datetime.datetime.now'}),
            'email': ('django.db.models.fields.EmailField', [], {'max_length': '75', 'blank': 'True'}),
            'first_name': ('django.db.models.fields.CharField', [], {'max_length': '30', 'blank': 'True'}),
            'groups': ('django.db.models.fields.related.ManyToManyField', [], {'symmetrical': 'False', 'related_name': "u'user_set'", 'blank': 'True', 'to': u"orm['auth.Group']"}),
            u'id': ('django.db.models.fields.AutoField', [], {'primary_key': 'True'}),
            'is_active': ('django.db.models.fields.BooleanField', [], {'default': 'True'}),
            'is_staff': ('django.db.models.fields.BooleanField', [], {'default': 'False'}),
            'is_superuser': ('django.db.models.fields.BooleanField', [], {'default': 'False'}),
            'last_login': ('django.db.models.fields.DateTimeField', [], {'default': 'datetime.datetime.now'}),
            'last_name': ('django.db.models.fields.CharField', [], {'max_length': '30', 'blank': 'True'}),
            'password': ('django.db.models.fields.CharField', [], {'max_length': '128'}),
            'user_permissions': ('django.db.models.fields.related.ManyToManyField', [], {'symmetrical': 'False', 'related_name': "u'user_set'", 'blank': 'True', 'to': u"orm['auth.Permission']"}),
            'username': ('django.db.models.fields.CharField', [], {'unique': 'True', 'max_length': '30'})
        },
        u'base.startup': {
            'Audience': ('django.db.models.fields.TextField', [], {}),
            'Benefits': ('django.db.models.fields.TextField', [], {}),
            'Business': ('django.db.models.fields.TextField', [], {}),
            'Competition': ('django.db.models.fields.TextField', [], {}),
            'Created At': ('django.db.models.fields.DateTimeField', [], {}),
            'Description': ('django.db.models.fields.TextField', [], {}),
            'Idea': ('django.db.models.fields.TextField', [], {}),
            'Image': ('django.db.models.fields.files.ImageField', [], {'max_length': '100'}),
            'Jobs': ('django.db.models.fields.TextField', [], {}),
            'Link': ('django.db.models.fields.URLField', [], {'max_length': '200'}),
            'Management': ('django.db.models.fields.TextField', [], {}),
            'Meta': {'object_name': 'Startup'},
            'Milestones': ('django.db.models.fields.TextField', [], {}),
            'Name': ('django.db.models.fields.TextField', [], {}),
            'Owner': ('django.db.models.fields.related.ForeignKey', [], {'to': u"orm['auth.User']", 'unique': 'True'}),
            'Problem': ('django.db.models.fields.TextField', [], {}),
            'Prod Mark': ('django.db.models.fields.TextField', [], {}),
            'Promotion': ('django.db.models.fields.TextField', [], {}),
            'Quality': ('django.db.models.fields.IntegerField', [], {}),
            'Risks': ('django.db.models.fields.TextField', [], {}),
            'Strategy': ('django.db.models.fields.TextField', [], {}),
            'Technologies': ('django.db.models.fields.TextField', [], {}),
            'Updated At': ('django.db.models.fields.DateTimeField', [], {}),
            'Use Cases': ('django.db.models.fields.TextField', [], {}),
            u'id': ('django.db.models.fields.AutoField', [], {'primary_key': 'True'})
        },
        u'contenttypes.contenttype': {
            'Meta': {'ordering': "('name',)", 'unique_together': "(('app_label', 'model'),)", 'object_name': 'ContentType', 'db_table': "'django_content_type'"},
            'app_label': ('django.db.models.fields.CharField', [], {'max_length': '100'}),
            u'id': ('django.db.models.fields.AutoField', [], {'primary_key': 'True'}),
            'model': ('django.db.models.fields.CharField', [], {'max_length': '100'}),
            'name': ('django.db.models.fields.CharField', [], {'max_length': '100'})
        }
    }

    complete_apps = ['base']