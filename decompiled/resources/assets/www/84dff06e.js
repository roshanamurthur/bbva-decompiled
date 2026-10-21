import{z as a,a8 as t,be as o,ac as r,ab as i,ad as e,bo as c,bp as n,bq as l,br as s,bs as b,an as m,L as d,ak as p,h as g,bt as y,bu as v,bv as u}from"./952f98a9.js";import{R as f,S as h,u as k,T as _,Y as x,D as $,v as B,w as I,x as z,G as w,Z as P}from"./216055dc.js";var T=a`
:host {
  --_skeleton-default-bg-color: var(--bbva-skeleton-default--_ambient--bg-color, var(--bbva-skeleton-default--custom--primary-ambient--bg-color, var(--color-primary-surface-ambient-preloading,#ffffff)));
  --_skeleton-default-animated-bg-color: var(--bbva-skeleton-default--_ambient--animated-bg-color, var(--bbva-skeleton-default--custom--primary-ambient--animated-bg-color, var(--color-primary-surface-ambient-default,#f4f4f4)));
  --_skeleton-default-bg-color-alt: var(--bbva-skeleton-default--_ambient--bg-color-alt, var(--bbva-skeleton-default--custom--primary-ambient--bg-color-alt, var(--color-primary-surface-alternative-preloading,#e9e9e9)));
  --_skeleton-default-animated-bg-color-alt: var(--bbva-skeleton-default--_ambient--animated-bg-color-alt, var(--bbva-skeleton-default--custom--primary-ambient--animated-bg-color-alt, var(--color-primary-surface-alternative-default,#ffffff)));
}

:host {
  position: relative;
  display: inline-block;
  overflow: hidden;
  width: 4.5rem;
  height: 3rem;
  box-sizing: border-box;
  border-radius: var(--borderRadiusMedium, ${t(o.medium)});
  color: var(--_clip-card-text-color);
  font-size: var(--typographyType3XSmall, ${t(r.type3XSmall)});
  font-style: var(--fontFacePrimaryBookItalicFontStyle, ${t(i.bookItalic.fontStyle)});
  font-weight: var(--fontFacePrimaryBookItalicFontWeight, ${t(i.bookItalic.fontWeight)});
  line-height: var(--lineHeightType4XSmall, ${t(e.type4XSmall)});
}

:host([size=xs]) {
  width: 2.25rem;
  height: 1.5rem;
}

:host([size=s]) {
  width: 3rem;
  height: 2rem;
}

:host([size=m]) {
  width: 3.75rem;
  height: 2.5rem;
}

:host([size=xl]) {
  width: 5.25rem;
  height: 3.5rem;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

.sr-only {
  border: 0;
  clip: rect(0 0 0 0);
  height: 1px;
  margin: -1px;
  overflow: hidden;
  padding: 0;
  position: absolute;
  width: 1px;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

.main {
  position: absolute;
  top: 0.3125rem;
  left: 0.25rem;
  display: flex;
  color: var(--_clip-card-main-logo-color);
}
:host([size=xs]) .main {
  top: 0.125rem;
  left: 0.0625rem;
}
:host([size=s]) .main {
  top: 0.1875rem;
  left: 0.125rem;
  height: 0.1875rem;
}
:host([size=m]) .main {
  top: 0.25rem;
  left: 0.1875rem;
}
:host([size=xl]) .main {
  top: 0.375rem;
  left: 0.3125rem;
}
.main.dark {
  color: var(--_clip-card-main-logo-dark-color);
}

.type {
  position: absolute;
  right: 0.25rem;
  bottom: 0.25rem;
  display: flex;
  height: 0.375rem;
  align-items: center;
}
:host([size=xs]) .type {
  right: 0.1875rem;
  bottom: 0.125rem;
  height: 0.1875rem;
}
:host([size=s]) .type {
  right: 0.1875rem;
  bottom: 0.125rem;
  height: 0.25rem;
}
:host([size=m]) .type {
  right: 0.1875rem;
  bottom: 0.125rem;
  height: 0.375rem;
}
:host([size=xl]) .type {
  right: 0.3125rem;
  bottom: 0.3125rem;
  height: 0.375rem;
}

svg {
  height: 100%;
}

.image-card {
  width: 100%;
  height: 100%;
}

.image-wrapper {
  width: 100%;
  height: 100%;
}

.partner {
  display: flex;
  overflow: hidden;
  height: 100%;
  align-items: center;
  justify-content: center;
  padding: 0.25rem;
  background-color: var(--_clip-card-partner-bg-color);
  text-align: center;
}
.partner-logo {
  position: relative;
}
.partner-text {
  position: relative;
}
:host([size=xs]) .partner-text {
  line-height: 0.75rem;
}

[data-tag-name=bbva-type-text] {
  color: var(--_clip-card-text-color);
}

.overlay {
  position: absolute;
  top: 0;
  right: 0;
  bottom: 0;
  display: flex;
  width: 3.125rem;
  align-items: center;
  justify-content: center;
  padding-left: 0.625rem;
}
:host([size=xs]) .overlay {
  width: 1.625rem;
  padding-left: 0.125rem;
}
:host([size=s]) .overlay {
  width: 2.125rem;
  padding-left: 0.125rem;
}
:host([size=m]) .overlay {
  width: 2.625rem;
  padding-left: 0.125rem;
}
:host([size=xl]) .overlay {
  width: 3.625rem;
  padding-left: 0.625rem;
}
.overlay-bg {
  position: absolute;
  top: 0;
  right: 0;
  bottom: 0;
  left: 0;
  transform: skewX(-15deg);
  transform-origin: bottom right;
}
.pay .overlay-bg {
  background-color: var(--_clip-card-pay-compatibility-color);
  opacity: 0.9;
}
:host([status=blocked]) .overlay-bg {
  background-color: var(--_clip-card-status-blocked-color);
}
:host([status=off]) .overlay-bg {
  background-color: var(--_clip-card-status-off-color);
}
:host([status=pending]) .overlay-bg {
  background-color: var(--_clip-card-status-pending-color);
}
:host([status=nfc]) .overlay-bg {
  background-color: var(--_clip-card-contactless-color);
  opacity: 0.9;
}
:host([status=digitalCard]) .overlay-bg {
  background-color: var(--_clip-card-contactless-color);
  opacity: 0.9;
}
:host([size=xs]) .overlay-bg {
  transform: skewX(-11deg);
}
:host([size=s]) .overlay-bg {
  transform: skewX(-12deg);
}
:host([size=m]) .overlay-bg {
  transform: skewX(-13deg);
}
:host([size=xl]) .overlay-bg {
  transform: skewX(-17deg);
}
.overlay-icon {
  position: relative;
}
.overlay-icon.status {
  color: var(--_clip-card-status-icon-color);
  fill: var(--_clip-card-status-icon-color);
}
:host([status=blocked]) .overlay-icon.status {
  fill: var(--_clip-card-status-icon-blocked-color);
}
:host([status=off]) .overlay-icon.status {
  fill: var(--_clip-card-status-icon-off-color);
}
:host([status=pending]) .overlay-icon.status {
  color: var(--_clip-card-status-icon-pending-color);
  fill: var(--_clip-card-status-icon-pending-color);
}
:host([status=nfc]) .overlay-icon.status {
  fill: var(--_clip-card-contactless-icon-color);
}
:host([status=digitalCard]) .overlay-icon.status {
  fill: var(--_clip-card-contactless-icon-color);
}
.pay .overlay-icon {
  height: 0.625rem;
  padding-right: 0.375rem;
  transform: scale(1.86);
}
:host([size=xs]) .pay .overlay-icon {
  padding-right: 0;
  transform: scale(1.035);
}
:host([size=s]) .pay .overlay-icon {
  padding-right: 0;
  transform: scale(1.38);
}
:host([size=m]) .pay .overlay-icon {
  padding-right: 0;
}
:host([size=xl]) .pay .overlay-icon {
  height: 0.75rem;
}

:host([loading][size=xs]) {
  height: 1.5rem;
  background-color: var(--_skeleton-default-bg-color);
  -webkit-mask-image: linear-gradient(black 100%, transparent 0);
  mask-image: linear-gradient(black 100%, transparent 0);
  -webkit-mask-position: 0 0;
  mask-position: 0 0;
  -webkit-mask-repeat: no-repeat;
  mask-repeat: no-repeat;
  -webkit-mask-size: 36px 24px;
  mask-size: 36px 24px;
  pointer-events: none;
  /*
  &::after {
     display: block;
     width: 100%;
     height: 100%;
     animation: skeletonAnimation 1500ms ease-in 100ms infinite alternate-reverse;
     background-color: var(--_skeleton-default-animated-bg-color);
     background-repeat: no-repeat;
     content: '';
     object-fit: cover;
     opacity: 0.1;
   }
   @keyframes skeletonAnimation {
     0% {
       opacity: 0.1;
     }
     100%{
       opacity: 1;
     }
   }*/
}
:host([loading][size=xs])::after {
  display: block;
  width: 100%;
  height: 100%;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
  background-color: var(--_skeleton-default-animated-bg-color);
  background-image: linear-gradient(var(--_skeleton-default-bg-color) 100%, transparent 0);
  background-position-x: 100vh;
  background-repeat: no-repeat;
  content: "";
  object-fit: cover;
  opacity: 0.5;
  transform: translateX(200%) scaleX(1);
  transform-origin: right bottom;
}
@keyframes skeletonAnimation {
  from {
    opacity: 0.5;
  }
  50% {
    opacity: 0.6;
  }
  60% {
    opacity: 0.6;
  }
  70% {
    opacity: 0.3;
  }
  90% {
    opacity: 0.1;
  }
  100% {
    opacity: 0;
    transform: translateX(0%) scaleX(2);
  }
}

:host([loading][size=s]) {
  height: 2rem;
  background-color: var(--_skeleton-default-bg-color);
  -webkit-mask-image: linear-gradient(black 100%, transparent 0);
  mask-image: linear-gradient(black 100%, transparent 0);
  -webkit-mask-position: 0 0;
  mask-position: 0 0;
  -webkit-mask-repeat: no-repeat;
  mask-repeat: no-repeat;
  -webkit-mask-size: 48px 32px;
  mask-size: 48px 32px;
  pointer-events: none;
  /*
  &::after {
     display: block;
     width: 100%;
     height: 100%;
     animation: skeletonAnimation 1500ms ease-in 100ms infinite alternate-reverse;
     background-color: var(--_skeleton-default-animated-bg-color);
     background-repeat: no-repeat;
     content: '';
     object-fit: cover;
     opacity: 0.1;
   }
   @keyframes skeletonAnimation {
     0% {
       opacity: 0.1;
     }
     100%{
       opacity: 1;
     }
   }*/
}
:host([loading][size=s])::after {
  display: block;
  width: 100%;
  height: 100%;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
  background-color: var(--_skeleton-default-animated-bg-color);
  background-image: linear-gradient(var(--_skeleton-default-bg-color) 100%, transparent 0);
  background-position-x: 100vh;
  background-repeat: no-repeat;
  content: "";
  object-fit: cover;
  opacity: 0.5;
  transform: translateX(200%) scaleX(1);
  transform-origin: right bottom;
}
@keyframes skeletonAnimation {
  from {
    opacity: 0.5;
  }
  50% {
    opacity: 0.6;
  }
  60% {
    opacity: 0.6;
  }
  70% {
    opacity: 0.3;
  }
  90% {
    opacity: 0.1;
  }
  100% {
    opacity: 0;
    transform: translateX(0%) scaleX(2);
  }
}

:host([loading][size=m]) {
  height: 2.5rem;
  background-color: var(--_skeleton-default-bg-color);
  -webkit-mask-image: linear-gradient(black 100%, transparent 0);
  mask-image: linear-gradient(black 100%, transparent 0);
  -webkit-mask-position: 0 0;
  mask-position: 0 0;
  -webkit-mask-repeat: no-repeat;
  mask-repeat: no-repeat;
  -webkit-mask-size: 60px 40px;
  mask-size: 60px 40px;
  pointer-events: none;
  /*
  &::after {
     display: block;
     width: 100%;
     height: 100%;
     animation: skeletonAnimation 1500ms ease-in 100ms infinite alternate-reverse;
     background-color: var(--_skeleton-default-animated-bg-color);
     background-repeat: no-repeat;
     content: '';
     object-fit: cover;
     opacity: 0.1;
   }
   @keyframes skeletonAnimation {
     0% {
       opacity: 0.1;
     }
     100%{
       opacity: 1;
     }
   }*/
}
:host([loading][size=m])::after {
  display: block;
  width: 100%;
  height: 100%;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
  background-color: var(--_skeleton-default-animated-bg-color);
  background-image: linear-gradient(var(--_skeleton-default-bg-color) 100%, transparent 0);
  background-position-x: 100vh;
  background-repeat: no-repeat;
  content: "";
  object-fit: cover;
  opacity: 0.5;
  transform: translateX(200%) scaleX(1);
  transform-origin: right bottom;
}
@keyframes skeletonAnimation {
  from {
    opacity: 0.5;
  }
  50% {
    opacity: 0.6;
  }
  60% {
    opacity: 0.6;
  }
  70% {
    opacity: 0.3;
  }
  90% {
    opacity: 0.1;
  }
  100% {
    opacity: 0;
    transform: translateX(0%) scaleX(2);
  }
}

:host([loading][size=l]) {
  height: 3rem;
  background-color: var(--_skeleton-default-bg-color);
  -webkit-mask-image: linear-gradient(black 100%, transparent 0);
  mask-image: linear-gradient(black 100%, transparent 0);
  -webkit-mask-position: 0 0;
  mask-position: 0 0;
  -webkit-mask-repeat: no-repeat;
  mask-repeat: no-repeat;
  -webkit-mask-size: 72px 48px;
  mask-size: 72px 48px;
  pointer-events: none;
  /*
  &::after {
     display: block;
     width: 100%;
     height: 100%;
     animation: skeletonAnimation 1500ms ease-in 100ms infinite alternate-reverse;
     background-color: var(--_skeleton-default-animated-bg-color);
     background-repeat: no-repeat;
     content: '';
     object-fit: cover;
     opacity: 0.1;
   }
   @keyframes skeletonAnimation {
     0% {
       opacity: 0.1;
     }
     100%{
       opacity: 1;
     }
   }*/
}
:host([loading][size=l])::after {
  display: block;
  width: 100%;
  height: 100%;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
  background-color: var(--_skeleton-default-animated-bg-color);
  background-image: linear-gradient(var(--_skeleton-default-bg-color) 100%, transparent 0);
  background-position-x: 100vh;
  background-repeat: no-repeat;
  content: "";
  object-fit: cover;
  opacity: 0.5;
  transform: translateX(200%) scaleX(1);
  transform-origin: right bottom;
}
@keyframes skeletonAnimation {
  from {
    opacity: 0.5;
  }
  50% {
    opacity: 0.6;
  }
  60% {
    opacity: 0.6;
  }
  70% {
    opacity: 0.3;
  }
  90% {
    opacity: 0.1;
  }
  100% {
    opacity: 0;
    transform: translateX(0%) scaleX(2);
  }
}

:host([loading][size=xl]) {
  height: 3.5rem;
  background-color: var(--_skeleton-default-bg-color);
  -webkit-mask-image: linear-gradient(black 100%, transparent 0);
  mask-image: linear-gradient(black 100%, transparent 0);
  -webkit-mask-position: 0 0;
  mask-position: 0 0;
  -webkit-mask-repeat: no-repeat;
  mask-repeat: no-repeat;
  -webkit-mask-size: 84px 56px;
  mask-size: 84px 56px;
  pointer-events: none;
  /*
  &::after {
     display: block;
     width: 100%;
     height: 100%;
     animation: skeletonAnimation 1500ms ease-in 100ms infinite alternate-reverse;
     background-color: var(--_skeleton-default-animated-bg-color);
     background-repeat: no-repeat;
     content: '';
     object-fit: cover;
     opacity: 0.1;
   }
   @keyframes skeletonAnimation {
     0% {
       opacity: 0.1;
     }
     100%{
       opacity: 1;
     }
   }*/
}
:host([loading][size=xl])::after {
  display: block;
  width: 100%;
  height: 100%;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
  background-color: var(--_skeleton-default-animated-bg-color);
  background-image: linear-gradient(var(--_skeleton-default-bg-color) 100%, transparent 0);
  background-position-x: 100vh;
  background-repeat: no-repeat;
  content: "";
  object-fit: cover;
  opacity: 0.5;
  transform: translateX(200%) scaleX(1);
  transform-origin: right bottom;
}
@keyframes skeletonAnimation {
  from {
    opacity: 0.5;
  }
  50% {
    opacity: 0.6;
  }
  60% {
    opacity: 0.6;
  }
  70% {
    opacity: 0.3;
  }
  90% {
    opacity: 0.1;
  }
  100% {
    opacity: 0;
    transform: translateX(0%) scaleX(2);
  }
}
`,A=a`
:host {
  --_clip-card-text-color: var(--bbva-clip-card--_ambient--text-color, var(--bbva-clip-card--custom--primary-ambient--text-color, ${f("colorPrimaryBadgeInfoText",h)}));
  --_clip-card-status-icon-color: var(--bbva-clip-card--_ambient--status-icon-color, var(--bbva-clip-card--custom--primary-ambient--status-icon-color,${f("colorPrimaryBadgeInfoText",h)}));
  --_clip-card-main-logo-color: var(--bbva-clip-card--_ambient--main-logo-color, var(--bbva-clip-card--custom--primary-ambient--main-logo-color, ${f("colorPrimaryBadgeInfoBackground",h)}));
  --_clip-card-main-logo-dark-color: var(--bbva-clip--_ambient--card-main-logo-dark-color, var(--bbva-clip-card--custom--primary-ambient--logo-dark-color, ${f("colorPrimaryBadgeInfoText",h)}));
  --_clip-card-partner-bg-color: var(--bbva-clip-card--_ambient--partner-bg-color, var(--bbva-clip-card--custom--primary-ambient--partner-bg-color, ${f("colorPrimaryBadgeInfoBackground",h)}));
  --_clip-card-pay-compatibility-color: var(--bbva-clip-card--_ambient--pay-compatibility-color, var(--bbva-clip-card--custom--primary-ambient--pay-compatibility-color, ${f("colorPrimaryNotificationInfoBackground",h)}));
  --_clip-card-status-blocked-color: var(--bbva-clip-card--_ambient--status-blocked-color, var(--bbva-clip-card--custom--primary-ambient--status-blocked-color, ${f("colorPrimaryBadgeErrorBackground",h)}));
  --_clip-card-status-icon-blocked-color: var(--bbva-clip-card--_ambient--status-icon-blocked-color, var(--bbva-clip-card--custom--primary-ambient--status-icon-blocked-color, ${f("colorPrimaryBadgeErrorText",h)}));
  --_clip-card-status-off-color: var(--bbva-clip-card--_ambient--status-off-color, var(--bbva-clip-card--custom--primary-ambient--status-off-color, ${f("colorPrimaryBadgeOffBackground",h)}));
  --_clip-card-status-icon-off-color: var(--bbva-clip-card--_ambient--status-icon-off-color, var(--bbva-clip-card--custom--primary-ambient--status-icon-off-color, ${f("colorPrimaryBadgeOffText",h)}));
  --_clip-card-status-pending-color: var(--bbva-clip-card--_ambient--status-pending-color, var(--bbva-clip-card--custom--primary-ambient--status-pending-color, ${f("colorPrimaryBadgeInfoBackground",h)}));
  --_clip-card-status-icon-pending-color: var(--bbva-clip-card--_ambient--status-icon-pending-color, var(--bbva-clip-card--custom--primary-ambient--status-icon-pending-color, ${f("colorPrimaryBadgeInfoText",h)}));
  --_clip-card-contactless-color: var(--bbva-clip-card--_ambient--contactless-color, var(--bbva-clip-card--custom--primary-ambient--contactless-color, ${f("colorPrimaryNotificationInfoBackground",h)}));
  --_clip-card-contactless-icon-color: var(--bbva-clip-card--_ambient--contactless-icon-color, var(--bbva-clip-card--custom--primary-ambient--contactless-icon-color, ${f("colorPrimaryText01Default",h)}));
}

:host([partner-logo]) {
  --bbva-clip-box--_ambient--dark-display: contents;
  --bbva-clip-box--_ambient--light-display: none;
  --bbva-clip-box--_ambient--border-color:none;
}
`;const X=a`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-clip-card--_ambient--text-color: initial;
    --bbva-clip-card--_ambient--status-icon-color: initial;
    --bbva-clip-card--_ambient--status-blocked-color: initial;
    --bbva-clip-card--_ambient--status-icon-blocked-color: initial;
    --bbva-clip-card--_ambient--status-off-color: initial;
    --bbva-clip-card--_ambient--status-icon-off-color: initial;
    --bbva-clip-card--_ambient--status-pending-color: initial;
    --bbva-clip-card--_ambient--status-icon-pending-color: initial;
    --bbva-clip-card--_ambient--contactless-color: initial;
    --bbva-clip-card--_ambient--contactless-icon-color: initial;
    --bbva-clip-card--_ambient--main-logo-color: initial;
    --bbva-clip-card--_ambient--main-logo-dark-color: initial;
    --bbva-clip-card--_ambient--partner-bg-color: initial;
    --bbva-clip-card--_ambient--pay-compatibility-color: initial;
  }
`,S=a`
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-clip-card--_ambient--text-color: var(
      --bbva-clip-card--custom--primary-alt-ambient--text-color,
      ${f("colorPrimaryAltBadgeInfoText",h)}
    );
    --bbva-clip-card--_ambient--status-icon-color: var(
      --bbva-clip-card--custom--primary-alt-ambient--status-icon-color,
      ${f("colorPrimaryAltBadgeInfoText",h)}
    );
    --bbva-clip-card--_ambient--status-blocked-color: var(
      --bbva-clip-card--custom--primary-alt-ambient--status-blocked-color,
      ${f("colorPrimaryBadgeErrorBackground",h)}
    );
    --bbva-clip-card--_ambient--status-icon-blocked-color: var(
      --bbva-clip-card--custom--primary-alt-ambient--status-icon-blocked-color,
      ${f("colorPrimaryBadgeErrorText",h)}
    );
    --bbva-clip-card--_ambient--status-off-color: var(
      --bbva-clip-card--custom--primary-alt-ambient--status-off-color,
      ${f("colorPrimaryBadgeOffBackground",h)}
    );
    --bbva-clip-card--_ambient--status-icon-off-color: var(
      --bbva-clip-card--custom--primary-alt-ambient--status-icon-off-color,
      ${f("colorPrimaryBadgeOffText",h)}
    );
    --bbva-clip-card--_ambient--status-pending-color: var(
      --bbva-clip-card--custom--primary-alt-ambient--status-pending-color,
      ${f("colorPrimaryBadgeInfoBackground",h)}
    );
    --bbva-clip-card--_ambient--status-icon-pending-color: var(
      --bbva-clip-card--custom--primary-alt-ambient--status-icon-pending-color,
      ${f("colorPrimaryBadgeInfoText",h)}
    );
    --bbva-clip-card--_ambient--contactless-color: var(
      --bbva-clip-card--custom--primary-alt-ambient--contactless-color,
      ${f("colorPrimaryNotificationInfoBackground",h)}
    );
    --bbva-clip-card--_ambient--contactless-icon-color: var(
      --bbva-clip-card--custom--primary-alt-ambient--contactless-icon-color,
      ${f("colorPrimaryText01Default",h)}
    );
    --bbva-clip-card--_ambient--partner-bg-color: var(
      --bbva-clip-card--custom--primary-alt-ambient--partner-bg-color,
      ${f("colorPrimaryAltBadgeInfoBackground",h)}
    );
    --bbva-clip-card--_ambient--main-logo-color: var(
      --bbva-clip-card--custom--primary-alt-ambient--main-logo-color,
      ${f("colorPrimaryAltBadgeInfoBackground",h)}
    );
    --bbva-clip--_ambient--card-main-logo-dark-color: var(
      --bbva-clip-card--custom--primary-alt-ambient--logo-dark-color,
      ${f("colorPrimaryAltBadgeInfoText",h)}
    );
    --bbva-clip-card--_ambient--pay-compatibility-color: var(
      --bbva-clip-card--custom--primary-alt-ambient--pay-compatibility-color,
      ${f("colorPrimaryAltNotificationInfoBackground",h)}
    );
  }
`,E=a`
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-clip-card--_ambient--text-color: var(
      --bbva-clip-card--custom--secondary-ambient--text-color,
      ${f("colorPrimaryBadgeInfoText",h)}
    );
    --bbva-clip-card--_ambient--status-icon-color: var(
      --bbva-clip-card--custom--secondary-ambient--status-icon-color,
      ${f("colorPrimaryBadgeInfoText",h)}
    );

    --bbva-clip-card--_ambient--status-blocked-color: var(
      --bbva-clip-card--custom--secondary-ambient--status-blocked-color,
      ${f("colorPrimaryBadgeErrorBackground",h)}
    );
    --bbva-clip-card--_ambient--status-icon-blocked-color: var(
      --bbva-clip-card--custom--secondary-ambient--status-icon-blocked-color,
      ${f("colorPrimaryBadgeErrorText",h)}
    );
    --bbva-clip-card--_ambient--status-off-color: var(
      --bbva-clip-card--custom--secondary-ambient--status-off-color,
      ${f("colorPrimaryBadgeOffBackground",h)}
    );
    --bbva-clip-card--_ambient--status-icon-off-color: var(
      --bbva-clip-card--custom--secondary-ambient--status-icon-off-color,
      ${f("colorPrimaryBadgeOffText",h)}
    );
    --bbva-clip-card--_ambient--status-pending-color: var(
      --bbva-clip-card--custom--secondary-ambient--status-pending-color,
      ${f("colorPrimaryBadgeInfoBackground",h)}
    );
    --bbva-clip-card--_ambient--status-icon-pending-color: var(
      --bbva-clip-card--custom--secondary-ambient--status-icon-pending-color,
      ${f("colorPrimaryBadgeInfoText",h)}
    );
    --bbva-clip-card--_ambient--contactless-color: var(
      --bbva-clip-card--custom--secondary-ambient--contactless-color,
      ${f("colorPrimaryNotificationInfoBackground",h)}
    );
    --bbva-clip-card--_ambient--contactless-icon-color: var(
      --bbva-clip-card--custom--secondary-ambient--contactless-icon-color,
      ${f("colorPrimaryNotificationInfoText",h)}
    );
    --bbva-clip-card--_ambient--partner-bg-color: var(
      --bbva-clip-card--custom--secondary-ambient--partner-bg-color,
      ${f("colorSecondaryBadgeInfoBackground",h)}
    );
    --bbva-clip-card--_ambient--main-logo-color: var(
      --bbva-clip-card--custom--secondary-ambient--main-logo-color,
      ${f("colorPrimaryBadgeInfoBackground",h)}
    );
    --bbva-clip--_ambient--card-main-logo-dark-color: var(
      --bbva-clip-card--custom--secondary-ambient--logo-dark-color,
      ${f("colorPrimaryBadgeInfoText",h)}
    );
    --bbva-clip-card--_ambient--pay-compatibility-color: var(
      --bbva-clip-card--custom--secondary-ambient--pay-compatibility-color,
      ${f("colorPrimaryNotificationInfoBackground",h)}
    );

    --bbva-clip-card--_ambient--text-color: var(
        --bbva-clip-card--custom--secondary-ambient--text-color,
        ${f("colorSecondaryBadgeInfoText",h)}
      );
  }
`,C=a`
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-clip-card--_ambient--text-color: var(
      --bbva-clip-card--custom--secondary-alt-ambient--text-color,
      ${f("colorPrimaryBadgeInfoText",h)}
    );
    --bbva-clip-card--_ambient--status-icon-color: var(
      --bbva-clip-card--custom--secondary-alt-ambient--status-icon-color,
      ${f("colorPrimaryBadgeInfoText",h)}
    );
    --bbva-clip-card--_ambient--status-blocked-color: var(
      --bbva-clip-card--custom--secondary-alt-ambient--status-blocked-color,
      ${f("colorPrimaryBadgeErrorBackground",h)}
    );
    --bbva-clip-card--_ambient--status-icon-blocked-color: var(
      --bbva-clip-card--custom--secondary-alt-ambient--status-icon-blocked-color,
      ${f("colorPrimaryBadgeErrorText",h)}
    );
    --bbva-clip-card--_ambient--status-off-color: var(
      --bbva-clip-card--custom--secondary-alt-ambient--status-off-color,
      ${f("colorPrimaryBadgeOffBackground",h)}
    );
    --bbva-clip-card--_ambient--status-icon-off-color: var(
      --bbva-clip-card--custom--secondary-alt-ambient--status-icon-off-color,
      ${f("colorPrimaryBadgeOffText",h)}
    );
    --bbva-clip-card--_ambient--status-pending-color: var(
      --bbva-clip-card--custom--secondary-alt-ambient--status-pending-color,
      ${f("colorPrimaryBadgeInfoBackground",h)}
    );
    --bbva-clip-card--_ambient--status-icon-pending-color: var(
      --bbva-clip-card--custom--secondary-alt-ambient--status-icon-pending-color,
      ${f("colorPrimaryBadgeInfoText",h)}
    );
    --bbva-clip-card--_ambient--contactless-color: var(
      --bbva-clip-card--custom--secondary-alt-ambient--contactless-color,
      ${f("colorPrimaryNotificationInfoBackground",h)}
    );
    --bbva-clip-card--_ambient--contactless-icon-color: var(
      --bbva-clip-card--custom--secondary-alt-ambient--contactless-icon-color,
      ${f("colorPrimaryNotificationInfoText",h)}
    );
    --bbva-clip-card--_ambient--partner-bg-color: var(
      --bbva-clip-card--custom--secondary-alt-ambient--partner-bg-color,
      ${f("colorSecondaryBadgeInfoBackground",h)}
    );
    --bbva-clip-card--_ambient--main-logo-color: var(
      --bbva-clip-card--custom--secondary-alt-ambient--main-logo-color,
      ${f("colorPrimaryBadgeInfoBackground",h)}
    );
    --bbva-clip--_ambient--card-main-logo-dark-color: var(
      --bbva-clip-card--custom--secondary-alt-ambient--logo-dark-color,
      ${f("colorPrimaryBadgeInfoText",h)}
    );
    --bbva-clip-card--_ambient--pay-compatibility-color: var(
      --bbva-clip-card--custom--secondary-alt-ambient--pay-compatibility-color,
      ${f("colorPrimaryNotificationInfoBackground",h)}
    );

    --bbva-clip-card--_ambient--text-color: var(
        --bbva-clip-card--custom--secondary-alt-ambient--text-color,
        ${f("colorSecondaryBadgeInfoText",h)}
      );
  }
`;const j=k([Object.freeze({__proto__:null,primary:X,primaryAlt:S,secondary:E,secondaryAlt:C}),_,x,$]),O=Object.values(j),L={blocked:{icon:c(),text:"bbva-clip-card-status-blocked"},off:{icon:n(),text:"bbva-clip-card-status-off"},pending:{icon:l(),text:"bbva-clip-card-status-pending"},nfc:{icon:s(),text:"bbva-clip-card-contactless-nfc"},digitalCard:{icon:b(),text:"bbva-clip-card-contactless-digital-card"}},N={apple:{logo:"applepay",text:"bbva-clip-card-pay-compatibility-apple"},google:{logo:"googlepay",text:"bbva-clip-card-pay-compatibility-google"}};class D extends(m(B(I(d)))){static get scopedElements(){return{"bbva-type-icon":z,"bbva-type-text":w,"bbva-clip-box":P}}static get is(){return"bbva-clip-card"}static get properties(){return{size:{type:String,reflect:!0},status:{type:String,reflect:!0},payCompatibility:{type:String,attribute:"pay-compatibility"},variant:{type:String},logo:{type:String},cardType:{type:String,attribute:"card-type"},cardImage:{type:String,attribute:"card-image"},logoDark:{type:Boolean,attribute:"logo-dark"},accessibilityText:{type:String,attribute:"accessibility-text"},partnerLogo:{type:String,attribute:"partner-logo"},partnerLogoVariant:{type:String,attribute:"partner-logo-variant"},partner:{type:Boolean},text:{type:String},loading:{type:Boolean,reflect:!0},staticEntity:{type:Boolean,attribute:"static-entity"},hideDarkEntity:{type:Boolean,attribute:"hide-dark-entity"},dummyEntityImage:{type:String,attribute:"dummy-entity-image"}}}constructor(){super(),this.size="l",this.cardAlt="",this.status="",this.payCompatibility="",this.variant="prepay",this.logo="",this.cardType="",this.statusInfo=L,this.payCompatibilityInfo=N,this.accessibilityText="",this.loading=!1,this.text="",this.staticEntity=!1,this.hideDarkEntity=!1,this.dummyEntityImage="https://assets.bbvaexperience.com/visual/icons/entities/dummy.svg"}static get styles(){return[super.styles,T,A,O,p("bbva-clip-card-shared-styles")]}_onErrorImage(){this.dispatchEvent(new CustomEvent("clip-card-image-error",{bubbles:!0,composed:!0,detail:{imageUrl:this.cardImage}}))}render(){return this.loading?g``:g`${this.partner?"":g`
              <span class="sr-only">
                <slot></slot>
                ${this._accessibleStatus}
              </span>
            `}
        ${this.partner||this.partnerLogo?this.partnerCard:this.card}
        ${this.payCompatibility&&!this.status?this.payCompatibilityOverlay:""}
        ${this.status?this.statusOverlay:""} `}get partnerCard(){return g`
      <div class="partner">
        ${this.partnerLogo?g`
              <bbva-clip-box
                .group=${[{size:"xs",icon:this.partnerLogo}]}
                .mode="${this.mode}"
                .ambient="${this.ambient}"
                ?static-entity="${this.staticEntity}"
                class="partner-logo"
                ?hide-dark-entity="${this.hideDarkEntity}"
                dummy-entity-image="${this.dummyEntityImage}"
              ></bbva-clip-box>
            `:g`
              <bbva-type-text
                class="partner-text"
                unset
                size="3XS"
                text="${this.text}"
                alignment="center"
                font-style="italic"
              ></bbva-type-text>
              <span class="sr-only"> ${this._accessibleStatus} </span>
            `}
      </div>
    `}get _accessibleStatus(){return g`
      ${this.status?`${this.t(this.statusInfo[this.status].text)}`:""}
      ${this.payCompatibility?`${this.t(this.payCompatibilityInfo[this.payCompatibility].text)}`:""}
    `}get card(){return g`
      <div aria-hidden="true" class="image-wrapper">
        ${this.cardImage?this._renderCardImage:this._cardAsset}
        ${this.cardImage?"":this.mainLogo}
        <span class="type">${this.typeLogo}</span>
      </div>
    `}get _renderCardImage(){return g` <img
      src="${this.cardImage}"
      id="cardImage"
      class="image-card"
      alt="${this.accessibilityText}"
      @error="${this._onErrorImage}"
    />`}get _cardAsset(){return g` <span class="bg"> ${y[`${this.variant}card`]} </span> `}get mainLogo(){return g` <bbva-type-icon
      class="main ${"default"!==this.variant?"dark":""}"
      icon="${this.logo&&"bbva"!==this.logo?this.logo:v()}"
      height="${this._mainLogoHeight}"
      width="${3.33*this._mainLogoHeight}"
      ambient="secondary"
    ></bbva-type-icon>`}get typeLogo(){return u`${y[this.cardType]}`}get _mainLogoHeight(){const a={xs:2,s:3,m:4,l:4,xl:5};return this.size in a?a[this.size]:a.l}get _statusIconSize(){const a={xs:16,s:16,m:24,l:24,xl:32};return this.size in a?a[this.size]:a.l}get statusOverlay(){return g`
      <div class="overlay status" aria-hidden="true">
        <div class="overlay-bg"></div>
        <bbva-type-icon
          class="overlay-icon status"
          icon="${this.statusInfo[this.status].icon}"
          size="${this._statusIconSize}"
        ></bbva-type-icon>
      </div>
    `}get payCompatibilityOverlay(){return g`
      <div class="overlay pay" aria-hidden="true">
        <div class="overlay-bg"></div>
        <span class="overlay-icon">
          ${y[this.payCompatibilityInfo[this.payCompatibility].logo]}
        </span>
      </div>
    `}}export{D as B,j as b};
